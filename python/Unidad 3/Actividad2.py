#Dado un nu mero, suma sus divisores. Haz un programa main con un metodo para
#sumar los divisores

def sumarDivisores(numero):
    suma = 0
    for i in range(1, numero+1):
        if numero % i == 0:
            suma += i
    return suma

if __name__ == "__main__":
    numero = int(input("Ingrese un numero: "))
    print(sumarDivisores(numero))
