import threading

contador=0 #varible compartida

def incrementarContador():
    global contador
    for i in range(100):
        
        contador=contador+1

def decrementarContador():
    global contador
    for i in range(100):
        contador=contador-1

def main():
    hilo1=threading.Thread(target=incrementarContador)
    hilo2=threading.Thread(target=decrementarContador)

    hilo1.start()
    hilo2.start()

    hilo1.join()
    hilo2.join()


    print(f"Valos de contado {contador}")


if __name__=="__main__":
    main()