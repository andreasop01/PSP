# 7. Escriba un programa que solicite un número, y si éste es de dos cifras, muestre por
# pantalla los siguientes valores:
#  Suma de sus dos dígitos.
#  Cuántos de sus dígitos son pares.
# Nota: para saber si es de dos cifras, compárelo con 9 y 99. Para calcular los dígitos use
# la división entera y el resto.

import sys
numero=int(sys.argv[1])

print("Escriba un numero")

if(numero>=10 and numero<=99):
    digito1=numero//10 
    digito2=numero%10

    print(f"la suma de los dos digitos {digito1+digito2}")

    if(digito1%2==0):
        print(f"digito1 {digito1} Es par")
    else:
        print("No es par")

    if(digito2%2==0):
         print(f"digito2 {digito2} Es par")
    else:
  
      print("No es par")

else:   
    print("No es de dos cifras") 
    
