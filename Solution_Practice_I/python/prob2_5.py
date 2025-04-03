from datetime import date

while True:
    print(f"Ingrese la fecha → (Día Mes Año): ")
    day, month, year = map(int, input().split())
    if 1 <= month and 1 <= day <= 31 and year >= 0: break
    else: print("Fecha Incorrecta")

if month>12: 
    available=0
elif month == 2:
    available = 29 if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0) else 28
elif month in [4, 6, 9, 11]:
    available = 30
else:
    available = 31

if day <= available:
    entered_date = date(year, month, day) #202
    if entered_date <= date.today():
        print("Fecha Correcta")
    else:
        print("Fecha Incorrecta")
else:
    print("Fecha Incorrecta")
