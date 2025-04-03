
while True:
    print("Ingrese la cantidad de rondas a jugar")
    quantity = int(input())
    if(quantity>0):
        break

for i in range(quantity):
    entered = input()
    values = entered.split()
    
    if len(values) != 3:
        print("")
    else:
        he, sa, lu = map(int, input().split())

        if he != sa and he != lu and sa == lu:
            print("Herland")
        elif sa != he and sa != lu and he == lu:
            print("Sami")
        elif lu != he and lu != sa and he == sa:
            print("Luisin")
        elif lu == he and he == sa:
            print("Iguales")
        else:
            print("Diferentes")
