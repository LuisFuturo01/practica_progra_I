while True:
    print(f"Ingrese los intervalos a1, b1 y a2, b2 → (a1 b1 a2 b3)")
    a1,b1,a2,b2=map(int, input().split(" "))
    if(a1<=b1 and a2<=b2):
        break
begin = a1 if a1>a2 else a2
end = b2 if b1>b2 else b1
print(f"[{begin},{end}]" if (begin <= end) else "[]")
