while True:
    print("Ingrese la cantidad de entradas: ")
    quantity = int(input())
    if 0 <= quantity < 15:
        break
    
for i in range(quantity):
    while True:
        while True:
            print("Ingrese 2 números: → (a b)")
            char_value = input().strip()
            values = char_value.split()
            if len(values) == 2:
                break
        a, b = int(values[0]), int(values[1])
        
        if (a if a>0 else a*-1) < 1000000001 and (b if b>0 else b*-1) < 1000000001:
            break
        
    if a > b:
        print(">")
    elif a < b:
        print("<")
    else:
        print("=")