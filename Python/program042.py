def CheckDivisible(iNo):
    if (iNo % 3 == 0) and (iNo % 5 == 0):
        return True
    else:
        return False


iValue = 0
bRet = False

print("Enter the No: ")
iValue = int(input())

bRet = CheckDivisible(iValue)

if bRet == True:
    print("Number is Divisible by 3 and 5")
else:
    print("Number is not Divisible by 3 and 5")
