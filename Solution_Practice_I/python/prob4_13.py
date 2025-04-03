while True:
    num=int(input("Ingrese cuantos numeros ver: "))
    if num>=0:
        break
binacci=0
aux=1
contv=0
while num>0:
    contv+=1
    for i in range(1, contv+1):
        if num>0:
            binacci+=aux
            aux=binacci-aux
            print(f"{binacci}!/{contv}", end="")
            num-=1
            if num!=0:
                print(" + ", end="")
