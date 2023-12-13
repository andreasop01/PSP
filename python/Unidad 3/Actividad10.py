#Implementa el algoritmo de la burbuja en Python para ordenar una lista.

def ordenarLista(lista):
    for i in range(len(lista)-1):
        for j in range(len(lista)-1):
            if lista[j] > lista[j+1]:
                aux = lista[j]
                lista[j] = lista[j+1]
                lista[j+1] = aux
    return lista

if __name__ == "__main__":
    lista = [3, 5, 1, 2, 4]
    print(ordenarLista(lista))

#Implementa el algoritmo de la burbuja en Python para ordenar una lista de forma descendente.