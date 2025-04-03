from math import sqrt
while True:
    print(f"Ingrese la D-demanda, S-costo de pedido y H-costo de almacenamiento por año → (d s h)")
    d, s, h = map(float, input().split(" "))
    if(d >= 0 and s >= 0 and h > 0):
        break
q=sqrt((2*d*s)/h)
print(round(q*100)/100)