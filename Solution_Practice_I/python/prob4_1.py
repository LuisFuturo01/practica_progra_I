binacci=0
aux=1
while True:
    print(f"Ingrese cuantos digitos ver")
    num=int(input())
    if num>=0:
        break
binacci=0
aux=1
i=0
while i<num:
    binacci+=aux
    aux=binacci-aux
    j=1
    for j in range(1, binacci+1):
        if i<num:
            print(j, end=" ")
            i+=1

