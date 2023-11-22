# 7. Escriba un programa que pida un tiempo en segundos y lo muestre convertido a
# minutos y segundos. 
import sys  
segundos = int(sys.argv[1])
minutos = segundos // 60
segundos=segundos%60

print(f"El tiempo en minutos es: {minutos,segundos}")



