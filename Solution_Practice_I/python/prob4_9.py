while True:
    num=int(input("Ingrese cuantos numeros ver: "))
    if num>=0:
        break
aux=0
new=1
while num>0:
    aux+=1
    cont=0
    for i in range(1, aux+1):
        if aux%i==0:cont+=1
    if cont==2:
        dig=aux%10
        print(new, end=" ")
        new+=dig
        num-=1

#Notinsky Javierinsky: empieza en 1 y se suma el ultimo digito de los numeros primos