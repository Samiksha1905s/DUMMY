def count(sentence):
    up=0
    low=0

    for ch in sentence:
        if(ch.islower()):
            low+=1
        elif(ch.isupper()):
            up+=1
    print("the uppper is ",up)
    print("the lower is",low)
sentence=input("enter sentence")
count(sentence)
