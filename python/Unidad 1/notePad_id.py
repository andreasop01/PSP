import subprocess
import time

def crearProceso():
    SW_SHOWMAXIMIZED=3
    proc=subprocess.Popen("notepad.exe")
    return proc

p=crearProceso()
print(f"El pid es {str(p.pid)}")
time.sleep(5)