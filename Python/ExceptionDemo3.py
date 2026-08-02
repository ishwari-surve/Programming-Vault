def main():

    Ans=0
try:
    print("Inside Try")

    print("Enter first number:")
    No1=int(input())

    print("Enter first number:")
    No2=int(input())

    Ans = No1/No2

except ZeroDivisionError as zobj:
    print("Insie except:",zobj)

except ValueError as vobj:
    print("Inside Except",vobj)

except Exception as eobj:                  #General except
    print("Inside except:",eobj)
    
finally:
  print("Inside finally")

print("Division is:",Ans)

if __name__=="__main__":
    main()