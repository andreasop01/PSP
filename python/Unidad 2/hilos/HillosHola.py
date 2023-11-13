import threading
import time
def imprimirMensaje(mensaje):
    for i in range(5):
        print(mensaje)
        time.sleep(2)

def main():
    hilo1=threading.Thread(target=imprimirMensaje,args=("Hilo 1: Hola",))
    hilo2=threading.Thread(target=imprimirMensaje,args=("Hilo 2: mundo",))

    hilo1.start()
    hilo2.start()

    hilo1.join()
    hilo2.join()

    print("Fin de main")





if __name__=="__main__":
    main()