while True:
    seconds = int(input("Ingrese los segundos: "))
    if(seconds>=0): 
        break
hours= seconds // 3600
minutes = (seconds%3600)//60
seconds%=60
print(
    (f"0{hours}:" if hours<10 else f"{hours}:")+
    (f"0{minutes}:" if minutes<10 else f"{minutes}:")+
    (f"0{seconds}" if seconds<10 else f"{seconds}")
)