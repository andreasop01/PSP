# Dada una LISTA con 7 temperaturas calcula la temperatura media y determinar
# entre todas ellas cuantas son superiores o iguales a esa media.

lista = [21, 23, 25, 27, 29, 31, 33]
suma = 0
for i in lista:
    suma += i

media = suma / len(lista)
print(f"La media es: {media}")
contador = 0
for item in lista:
    if item >= media:
        contador += 1

print(f"La cantidad de temperaturas mayores o iguales a la media es: {contador}")


