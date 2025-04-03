while True:
    print("Ingrese cuantos digitos ver:")
    num = int(input())
    if num >= 0:
        break
a=1
b=2
c=3
d=4
for i in range(num):
    if i==0: print(a, end=" ")
    elif i==1: print(b, end=" ")
    elif i==2: print(c, end=" ")
    elif i==3: print(d, end=" ")
    else:
        sum=a+b+c+d
        a=b
        b=c
        c=d
        d=sum
        print(sum, end=" ")