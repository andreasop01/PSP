import threading

contador=0 #varible compartida
lock=threading.Lock()

def incrementarContador():
    global contador
    for i in range(100000):
        lock.acquire()
        contador=contador+1
        lock.release()
        print(f"Sumar{contador}")


def decrementarContador():
    global contador
    for i in range(100000):
        lock.acquire()
        contador=contador-1
        lock.release()
        print(f"Resta{contador}")

def main():
    hilo1=threading.Thread(target=incrementarContador)
    hilo2=threading.Thread(target=decrementarContador)

    hilo1.start()
    hilo2.start()

    #hilo1.join()
    #hilo2.join()


    print(f"Valos de contador {contador}")


if __name__=="__main__":
    main()