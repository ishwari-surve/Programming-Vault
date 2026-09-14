def CheckEvenOdd(iNo):
    iRemainder = 0
    iRemainder = iNo % 2

    if iRemainder == 0:
        return True
    else:
        return False


iValue = 0
bRet = False

print("Enter number to check whether it is Even or Odd:")
iValue = int(input())

bRet = CheckEvenOdd(iValue)

if bRet == True:
    print(iValue, "is Even")
else:
    print(iValue, "is odd")
