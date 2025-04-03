while True:
    print(f"Ingrese el monto prestado, interes anual y el tiempo de años → (cantidad interes tiempo)")
    money, interest, time = map(float, input().split(" "))
    time = int(time)
    if(money>=0 and interest>=0 and time>=0):
        break
interest/=100
interest*=money
for i in range(0, time, 1):
    money+=interest
print(money)