def CheckEvenOdd(iNo):
    iRemainder = 0
    iRemainder = iNo % 2

    return iRemainder


iValue = 0
iRet = 0

print("Enter Number to check whether is it Even or Odd:")
iValue = int(input())

iRet = CheckEvenOdd(iValue)

if iRet == 0:
    print(iValue, "is Even")
else:
    print(iValue, "is Odd")
