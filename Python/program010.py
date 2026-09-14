def CheckEvenOdd(iNo):
    iRemainder = 0
    iRemainder = iNo % 2

    if iRemainder == 0:
        print("Number is Even :")
    else:
        print("Number is odd :")

    return 0


iValue = 0

print("Enter number :")
iValue = int(input())

CheckEvenOdd(iValue)
