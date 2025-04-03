addition = 0
numbers = ""
while True:
    print(f"Ingrese un numero: ")
    num = int(input())
    if num>=0:
        break

for i in range(2, num, 1):
    aux = 0
    while num % i == 0:
        num /= i
        aux +=1
    if aux > 0:
        numbers += f"{i}^{aux}*"
        addition += i
if numbers != "": numbers+="1"
else: numbers += "0"

print(f"{numbers} {addition}")