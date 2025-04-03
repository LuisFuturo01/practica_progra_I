while True:
    num=int(input("Ingrese cuantos numeros ver: "))
    if num>=0:
        break
fac=1
for i in range(1,num+1):
    fac*=i
    print(fac, end=" ")