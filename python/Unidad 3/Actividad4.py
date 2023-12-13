# Calcular la suma de los divisores de cada nu mero introducido por teclado.
# Terminaremos cuando el nu mero sea negativo

def sumarDivisores(numero):
    suma = 0
    for i in range(1, numero+1):
        if numero % i == 0:
            suma += i
    return suma

if __name__ == "__main__":
    numero = int(input("Ingrese un numero: "))
    while numero >=0:
     print(sumarDivisores(numero))
     numero = int(input("Ingrese un numero: "))


