def Checkdivisible(iNo):
    if (iNo % 3 == 0) and (iNo % 5 == 0):
        print("Number is divisible by 3 & 5")
    else:
        print("Number is not divisible by 3 & 5")


iValue = int(input("Enter number : "))

Checkdivisible(iValue)
