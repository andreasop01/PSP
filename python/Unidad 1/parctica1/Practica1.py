# 1. Escriba un programa que muestre en la pantalla un mensaje de saludo, por ejemplo
# "Hola",y luego muestre el mensaje "Por favor introduzca el año en que nació". El
# programa debe leer ese valor y almacenarlo en una variable de tipo entero llamada
# fecha. Por último, haga que el programa escriba la frase " Si usted nació en <valor de la
# fecha leída> este año cumple <edad calculada> años. 

import sys
print("Hola")
print("Por favor introduzca el año en que nació")
fecha=int(sys.argv[1])
edad=2023-fecha

print("Si usted nació en",fecha,"este año cumple",edad,"años")

