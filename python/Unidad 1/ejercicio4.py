import subprocess

resultado=subprocess.run(["dir"],shell=True,capture_output=True,text=True)

print(resultado.stdout)