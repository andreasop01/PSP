def main():
    print(
        """**********************************************
        Calculo de nomina
        1) Programador Junior
        2) Programador senior
        3) Jefe de proyecto"""
    )

    sueldo = 0
    cargo = int(input("Introduzca el cargo del empleado: "))

    if cargo == 1:
        sueldo = 950
    elif cargo == 2:
        sueldo = 1200
    elif cargo == 3:
        sueldo = 1600

    dias = int(input("Cuantos días ha estado de viaje visitando clientes?: "))

    sueldoV = dias * 30

    estadoCivil = int(input("Introduzca su estado civil (1- Soltero, 2- Casado): "))

    porcentaje_descuento = 0

    if estadoCivil == 1:
        porcentaje_descuento = 25
    elif estadoCivil == 2:
        porcentaje_descuento = 20

    descuento = (sueldo + sueldoV) * (porcentaje_descuento / 100)
    valor_con_descuento = (sueldo + sueldoV) - descuento

    nomina(sueldo, dias, sueldoV, porcentaje_descuento, descuento, valor_con_descuento)


def nomina(sueldo, dias, sueldoV, porcentaje_descuento, descuento, valor_con_descuento):
    print(f"""
    Sueldo base: {sueldo}
    Dietas: {sueldoV}
    -----------------------------------
    Sueldo bruto: {sueldoV}
    Retencion IRPF {porcentaje_descuento}%: {descuento}
    -------------------------------------------------
    Sueldo neto: {valor_con_descuento}
    """)


if __name__ == "__main__":
    main()
