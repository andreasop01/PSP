import sys
numero1=int(sys.argv[1])
numero2=int(sys.argv[2])

cont=0

for i in range(numero1,numero2+1):                                         
    for j in range(2,i):
        if i%j==0:
            break
    else:
        cont+=1

print(f"Entre {numero1} y {numero2} hay {cont} numeros primos")