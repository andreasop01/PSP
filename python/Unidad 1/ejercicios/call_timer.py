import subprocess

resultado=subprocess.run(["python","timer.py","9"])

#print(resultado.stderr) #el error
print(resultado.returncode) #error si sale 0 todo esta bien



