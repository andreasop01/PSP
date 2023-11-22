import sys
from time import sleep

#print(sys.argv)

time=int(sys.argv[1])
#print(time)

print(f"Inicializo el contador a {time} segundos")

for i in range(time):
    print(".",end="",flush=True)
    sleep(1)

print("FIN")