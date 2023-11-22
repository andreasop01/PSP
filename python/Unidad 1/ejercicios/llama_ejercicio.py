import subprocess
resultado=subprocess.run(["python","Unidad 1/ejercicio3.py"],capture_output=True,text=True)
print(resultado.stdout)
