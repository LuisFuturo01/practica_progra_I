while True:
    num=int(input("Ingrese cuantos numeros ver:"))
    if num>=0:
        break
sumt=0
a=1
b=1
c=2
sum=a+b+c
cont2=0
cont3=1
cont4=0
aux3=2
sumult=0.0
add=True
for i in range(num):
    if i == 0: aux = a
    elif i == 1: aux = b
    elif i == 2: aux = c
    else:
        sumt=a+b+c
        aux = sumt
        a=b
        b=c
        c=sumt
    print(aux, end="")
    while True:
        cont=0
        cont2+=1
        for j in range(1,cont2+1):
            if cont2%j==0: cont+=1
        if (cont==2):
            break
    aux2=cont2
    print(f"/{aux2}", end="")
    if cont3<=num:
        if cont3==1:
            print(" - ",end="")
            sumult=sumult+(float(aux)/float(aux2))
        elif not add:
            print(" + ",end="")
            sumult=sumult+(float(aux)/float(aux2))
        else:
            print(" - ",end="")
            sumult=sumult-(float(aux)/float(aux2))
        if cont3!=1: cont4+=1
        if cont4==aux3:
            add= not add
            aux+=1
            cont4=0
        cont3+=1
print(f"\n{sumult}")