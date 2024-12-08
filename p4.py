def even_odd(start,end):
    even_list = []
    odd_list = []
    esum=0
    osum=0
    for i in range(start,end+1):
      if(i%2==0):
        even_list.append(i)
        esum+=i
      else:
        odd_list.append(i)
        osum+=i
    print("even numbers", even_list )
    print("odd numbers", odd_list)
    print("esum",esum)
    print("osum", osum)


start=int(input("enter start"))
end=int(input("enter end"))
even_odd(start,end)