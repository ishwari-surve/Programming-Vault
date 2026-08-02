#Procedural

def CheckEven(No):
    return(No % 2 == 0)
        
    

def main():
    Value = 0  #local variable
    Ret = False
    
    print("Enter Number :")
    Value = int(input())

    Ret = CheckEven(Value)

    if(Ret == True):
       print("It is even")
    else:
       print("It is odd")

if __name__=="__main__":
    main()