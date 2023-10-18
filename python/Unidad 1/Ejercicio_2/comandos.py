import subprocess

def main():
    comando=input("Ingrese el comando: ")
    resultado=subprocess.run(comando,capture_output=True,text=True,shell=True)

    err=resultado.returncode;

    if err==0:
        print(resultado.stdout)
    else:
        print("Errores: ")
        print(resultado.stderr)
        print(f"El comando delvolvio un numero de salida {err}")





if __name__=="__main__":
    main()