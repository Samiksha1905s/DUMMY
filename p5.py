student=[]

for i in range(4):
    print("enter details")
    name=str(input("enter the anme "))
    age=int(input("enter the age "))
    avg=float(input("enter the avg "))
    students=(name,age,avg)
    student.append(students)

print("list of students ")
print(student)