while True:
    print(f"Ingrese la distancia y cuanto tiempo queda → (distancia time)")
    distance, time = map(float, input().split(" "))
    if distance >= 0 and time > 0:
        break

time *= 60
print(f"{round(distance * 100 / time) / 100} m/s")
