def DisplayDigit(iNo):
    iDigit = 0

    while iNo != 0:
        iDigit = iNo % 10
        print(iDigit)
        iNo = iNo // 10


print("Enter number :")
iValue = int(input())

DisplayDigit(iValue)
