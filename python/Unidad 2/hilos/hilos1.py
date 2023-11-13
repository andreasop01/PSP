import threading
import logging
import time

def thread_funtion(name):
    logging.info(f"Hilos{name} esta empezando")
    time.sleep(2)
    logging.info(f"Hilos{name} esta terminando")

if __name__=="__main__":
    format="%(asctime)s:%(message)s"
    logging.basicConfig(format=format,level=logging.INFO,datefmt="%H:%M:S")
    logging.info("Main: antes de llamar al hilo")


    x=threading.Thread(target=thread_funtion,args=(1,))
    x.start()
    logging.info("Main: despues de llamar al hilo")
    logging.info("FIN Main")