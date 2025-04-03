while True:
    weight = int(input("Ingrese cuantos kg pesa la Piña: "))
    if 1 <= weight <= 100:
        break

part = weight // 2
if part % 2 == 1:
    part -= 1

weight -= part

if weight % 2 == 0 and part % 2 == 0 and weight != 2:
    print("SI")
else:
    print("NO")
