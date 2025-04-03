while True:
    print(f"Ingrese la temperatura en grados Celsius: ")
    celsius = float(input())
    if celsius >= -273.15:
        break

fahrenheit =  round(((celsius * 9/5) + 32)*100)
kelvin = round((celsius + 273.15)*100)
rankine = round(((celsius + 273.15) * 9/5)*100)
reaumur = round((celsius * 4/5)*100)

print("Fahrenheit:", fahrenheit/ 100, "°F")
print("Kelvin:", kelvin/ 100, "K")
print("Rankine:",rankine/ 100, "°R")
print("Réaumur:", reaumur/ 100, "°Ré")
