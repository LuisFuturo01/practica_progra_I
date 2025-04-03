while True:
    num=int(input("Ingrese cuantos numeros ver: "))
    if num>=0:
        break
sw=True
par=0
binacci=1
aux=-1
for i in range(1, num+1):
    if sw:
        par+=2
        print(par, end=" ")
    else:
        binacci+=aux
        aux=binacci-aux
        print(binacci, end=" ")
    sw= not sw