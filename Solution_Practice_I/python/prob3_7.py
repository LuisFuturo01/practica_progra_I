while True:
    print("Ingrese los casos de prueba: ")
    quantity = int(input())
    if 1 <= quantity <= 1000:
        break

for i in range(quantity):
    while True:
        print("Longitud de contraseña: ")
        length = int(input())
        if 1 <= length <= 20:
            break
    
    password = input()

    flag = True

    if len(password) == length:
        for j in range(len(password) - 1):
            character = password[j]
            characterNext = password[j + 1]

            if (ord(character) <= ord(characterNext) and
                ((48 <= ord(character) <= 57 and 48 <= ord(characterNext) <= 57) or
                 (48 <= ord(character) <= 57 and 97 <= ord(characterNext) <= 122) or
                 (97 <= ord(character) <= 122 and 97 <= ord(characterNext) <= 122))):
                flag = True
            else:
                flag = False
                break
    else:
        flag = False

    if flag:
        print("YES")
    else:
        print("NO")
