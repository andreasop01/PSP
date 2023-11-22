import threading
import time

class Olla:
    def __init__(self):
        self.lock = threading.Condition()
        self.contenido = []

    def agregar_misionero(self, misionero):
       with self.lock:
            self.contenido.append(misionero)
            print(f"Se ha agregado un misionero a la olla. Contenido: {self.contenido}")
            self.lock.notify()

    def comer_misionero(self, canibal):
        with self.lock:
          #Mientras esté vacío espera
            while(len(self.contenido)==0):
                print(f"El canibal {canibal} esta esperando :")
                self.lock.wait()

            print(f"{canibal} ha comido a un misionero. Contenido restante: {self.contenido}")
            self.contenido.pop()



def canibal(id, olla):
    #crear 3 caníbales y llamar al método comer de Olla
    while(True):
        olla.comer_misionero(id)
        time.sleep(1)
        



def cocinero(olla):
    #Cocinar n misioneros
    for i in range(20): 
        olla.agregar_misionero(i)
        time.sleep(2)

def main():
    olla = Olla()

    # Creamos hilos para los caníbales
    hilos_canibales = [threading.Thread(target=canibal, args=(i, olla)) for i in range(3)]
   

    # Creamos el hilo para el cocinero
    hilo_cocinero = threading.Thread(target=cocinero, args=(olla,))
    

    # Iniciamos los hilos
    for h in hilos_canibales:
        h.start()
    
    hilo_cocinero.start()

   

    # Esperamos a que todos los hilos terminen
  

if __name__ == "__main__":
    main()
    