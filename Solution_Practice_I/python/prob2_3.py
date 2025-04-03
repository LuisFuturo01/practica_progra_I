while True:
    print("Ingrese el ID y cantidad de compra → (id cantidad)")
    id, purchase = map(float, input().split())
    int(id)
    if(purchase>=0 and id>0):
        break
if purchase>1200:
    purchase-=100

if id<100:
    purchase-=(purchase*0.2)
elif id<1000 and purchase>400:
    purchase-=(purchase*0.1)
print(f"{purchase:.1f}")
