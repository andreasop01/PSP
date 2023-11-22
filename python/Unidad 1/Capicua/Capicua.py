import sys

numero=sys.argv[1]
#numeroRever=numero[::-1]
numeroRever=""

for i in numero:
    numeroRever=i+numeroRever
   

if numeroRever == numero:
    print("El numero es capicua")
else:
    print("El numero no es capicua")

