def con(str):
    if str.islower():
        print("upper case is ",str.upper())
    elif str.isupper():
         print("lower case is ",str.lower())
    else:
        print("swapcase ",str.swapcase())

str=str(input("enter sentence"))
con(str)
       