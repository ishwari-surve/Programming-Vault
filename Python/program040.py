def Checkdivisible(iNo):
    if (iNo % 3 == 0) and (iNo % 5 == 0):
        print("Number is dividble by 3 & 5")
    else:
        print("Number is not dividible by 3 & 5")


print("Enter number :")
iValue = int(input())

Checkdivisible(iValue)
