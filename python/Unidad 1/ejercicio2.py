import subprocess

try:
    #subprocess.run(["Notepad.exe"])
    #subprocess.run(["C:/Windows/System32/Notepad.exe"])
    subprocess.run(["Notepad.exe","C:/Users/Tarde.12_b21_ribera.000/Desktop/PSP/python/Unidad 1/texto.txt"])
except subprocess.CalledProcessError as e:
    print(e.output)