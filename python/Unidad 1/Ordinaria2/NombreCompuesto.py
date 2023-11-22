import sys
nombre=sys.argv[1]


if " " in nombre :
    print("El nombre es compuesto")
    primer_nombre=nombre.split(" ")[0]

    if len(primer_nombre) >= 4:
        print("El primer nombre tiene mas de 4 letras")

else:
    print("El nombre no es compuesto")
    