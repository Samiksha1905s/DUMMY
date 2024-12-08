a=int(input("enter the number for which you want to find the factorial"))
fact=1
if(a<0):
    print("factorial of negatve doesnt exist")
elif(a==0):
    print("factorial of 0 is 1")
else:
    for i in range(1,a+1):
        fact*=i
    print("the factorial is",fact)



