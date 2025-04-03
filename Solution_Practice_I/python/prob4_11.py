while True:
    num=int(input("Ingrese cuantos numeros ver:"))
    if num>=0:
        break
binacci=1
aux=-1
sw=True
aux2=0
while num>0:
    if sw:
        binacci+=aux
        aux=binacci-aux
        print(binacci, end=" ")
    else:
        while True:
            aux2+=1
            cont=0
            for i in range(1, aux2+1):
                if aux2%i==0:cont+=1
            if cont==2:
                print(aux2, end=" ")
                break
    num-=1
    sw=not sw