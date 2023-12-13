# Crea un programa en Python que imprima los 10 primeros numeros pares
# comenzando en 2 e imprima tambie n sus respectivos cubos.

def imprimirPares():
    for i in range(2, 21, 2):
        print(f"{i} el cubo de , {i**3})")

if __name__ == "__main__":
    imprimirPares()