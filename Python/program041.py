def Checkdivisible(iNo):
    if (iNo % 3 == 0) and (iNo % 5 == 0):
        return True
    else:
        return False


print("Enter number :")
iValue = int(input())

bRet = Checkdivisible(iValue)

if bRet == True:
    print("Number is dividble by 3 & 5")
else:
    print("Number is not dividible by 3 & 5")
