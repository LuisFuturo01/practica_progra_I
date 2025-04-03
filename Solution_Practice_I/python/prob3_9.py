cont=0
while True:
    while True:
        print("Ingrese dos numeros → (x y)")
        valueString=input()
        values=valueString.strip().split(" ")
        if(len(values)==2): break
    x=int(values[0])
    y=int(values[1])
    if y>0: break
if x<0:
    x*=-1
    less=False
else: less=True
while x>=y:
    x-=y
    cont+=1
print(f"{cont} {x}") if less else print(f"-{cont} {x}")
