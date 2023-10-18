
def main():
        print("Hola mundo")


#def nombre de la funcion(input1,input2,....,input)
#cuerpo 
#return out put

def buenosDias(nombre):
        print(f"Buenos dias {nombre}")


def division(x,y):
        c=x//y
        r=x%y
        return c,r


def suma(*numeros):
        sum=0
        for n in numeros:
                sum+=n
        return sum
        
if __name__=="__main__":
        main()

        buenosDias(nombre="Luis")
        print(division(60,6))
        print(division(x=60,y=6))
        print(division(y=60,x=6))
        print(suma(1,2,3,4,5))
        print(suma(1,2,3))