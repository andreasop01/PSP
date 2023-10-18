#similares alas lista pero inmutables
t=(1,"Hola",True)
print(t)

#acceso a los elementos

print(t[0])

#para ver si un elemento esta en una tupla

print(1 in t)  #true esta, false no 

t=("Manzana","Kiwi","Cereza") #no se puede modificar

#pasar a list si quieres modificar

t=list(t)
print(t)
#puedes pasar a lista, modificar y luego pasar otra veza lista
t=tuple(t)
print(t)


t1=("Manzana","kiwi","Cereza")
print(t+t1)

#tamaño de una tuple
print(len(t1))

#recorrer una tuple
for fruta in t1:
    print(fruta)

#CONJUNTOS
#es un conjunto de datos y sus elementos no pueden estar repetidos
set1=set([1,1,2,2,2,3,4])
print(set1)

set1={"Hola","Adios","Buenas"}
print(set1)

set={1,"a","o","u",2,3,"i",4,"e",5}
print(set)

A={1,3,5,2}
B={2,4,6}

print(A.union(B))
print(A.intersection(B))
print(A-B)

#recorrer un conjunto

for i in A:
    print(i,end=" ")
