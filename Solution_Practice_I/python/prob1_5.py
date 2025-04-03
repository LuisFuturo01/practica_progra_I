while True:
    print("Ingrese el salario base, años de antigüedad y cuántas horas da tutorías o cursos extra → (salarioBase antiguedad horasDeCurso)")
    base_salary, antique, courses = map(int, input().split(" "))
    if 1800 < base_salary < 14000 and 1 < antique < 10 and 1 < courses < 8:
        break
base_salary += base_salary * 0.05 * antique + (20 * courses)
print(f"Sueldo Mensual: {round(base_salary)} Bs")
print(f"Sueldo Anual: {round(base_salary*12)} Bs")
