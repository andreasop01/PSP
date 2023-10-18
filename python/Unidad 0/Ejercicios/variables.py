import keyword
import random




print(keyword.kwlist) #palabras reservadas

x=1
print(x) #varibales

x="hola mundo!"

print(x)

#no comienzan con numeros
#no caracteres especiales

nombre,edad="Marta",23
print(f"tu nombre es {nombre} y tu edad {edad}") #cadenas f
print("Tu nombre es",nombre,"y tu edad",edad) #otra forma 

##########################################
#operaciones aritmeticas

x=3
x=3+1
print(x)
x=x+6
print(x)
x+=2 #sto es igual a x=x+2
print(x)

x="7.8"
print(type(x))  #te dice el tipo de dato que es 

################################################
#como introducir datos por teclado

# x=input("dame un numero con decimales")
# print(f"El numero es {x}")
# #redondear un numero
# print(round(float(x),2))

cociente=15//5 #doble barra es el cociente de la division
print(cociente)

resto=15%6 #resto %
print(resto)

print(f"Potencia: {pow(2,3)}")
print(f"valor absoluto {abs(-9)}")

print(f"El maximo del conjunto de (3,5,6,2,9) es {max(3,5,6,2,9)}")

primero=min("Victoria","Juan","Pedro")
print(primero)

sumar=sum((2,8,9,6))
print(sumar)

print(f"Numeros ordenados: {sorted((9,8,2,1,18))}") #ordenar de menor a mayor SORTED

#repetir strings 
cadena="Hola "
print(cadena*5)

#para los subString

palabra="Hipopotamo"
print(palabra[0])
print(palabra[1:5])

# n1=int(input("Edad : "))
# print(n1)

#metodos parecidos para trabajar con Strings

nombre="Luisa"
if nombre.startswith("L"):
    print("Tu nombre empieza con L ")

print(nombre.upper()) #todo el mayuscula
print(nombre.capitalize()) #la primera en mayuscula


print(f"Numero aleatorio : {random.randrange(1,7)}")


