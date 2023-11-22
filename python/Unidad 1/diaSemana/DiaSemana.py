# 11. Escriba un programa que pida al usuario un número entre el uno y el siete y muestre
# un mensaje con el nombre del día correspondiente 

import sys

numero=int(sys.argv[1])
dias=["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"]

print(dias[numero-1])