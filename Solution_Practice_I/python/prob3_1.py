from math import pow
while True:
    print(f"Ingrese cuantos casos habra")
    quantity=int(input())
    if(quantity>=0):
        break
for i in range(quantity):
    while True:
        while True:
            values= input().strip().split()
            if(len(values)==2):
                a,b=map(int, values)
                break
        if (2<=a<=pow(10,5) and 2<=b<=pow(10,5)):
            break
    for j in range((b if (a > b) else a), 1 ,-1):
        if a%j==0 and b%j==0:
            print(j)
            break
                

