class DigitX:
    def DisplayDigits(self, iNo):
        iDigit = 0

        while iNo != 0:
            iDigit = iNo % 10
            print(iDigit)
            iNo = iNo // 10


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

dobj.DisplayDigits(iValue)
