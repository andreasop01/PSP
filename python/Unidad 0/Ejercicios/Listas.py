#listas

l=["Hola",1,True]
print(1)

#tamaño

print(len(l))

#Elemento de una lista

names=["Paco","Luis","Marta","Jaime"]

print(names[0])
print(names[-1])
print(names[-2])
print(names[1:3])
print(names[:3])

#Funciones

names.append("Adrian") #añades a la lista
print(names)

#insertar en otra posicion

names.insert(1,"Lucia")
print(names)


names2=["Olivia","Hector"]
names3=names+names2  #concatenar listas

print(names3)


#count recibe un elemento como argumento y devuelve cuantas veces esta en la lista

number=[0,1,1,2,2,2,3,3,3,3]
counted=[]

for element in number:
    if element not in counted:
        counted.append(element)
        print(f"El elemento {element} aparece {number.count(element)}")


#ordenar una lista
number.sort()
print(number)

#lista alreves

number.reverse()
print(number)

#borrar elemento de la lista en una posicion

del number[0]
print(number)




#recorrer lista

for i in range(len(names)):
    print(names[i],end=" ")
print("\nBucle 2")

for name in names:
    print(name,end=" ")

l=[] #Lista vacia

numeros=list(range(0,100,2))
print(numeros)

#Matriz

matriz=[[1,2],[3,4]]

print(matriz)