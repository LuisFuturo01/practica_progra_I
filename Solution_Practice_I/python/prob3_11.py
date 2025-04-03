print("ingrese sus palabras")
words = input()
upper=True
newWord=""
for i in range(len(words)):
    word=words[i]
    if not word.isnumeric():
        if upper:
            newWord+=word.upper()
            upper= not upper
        else:
            newWord+=word.lower()
            upper=not upper
    else:
        newWord+=word
print(newWord)