class DigitX:
    def DisplayDigits(self, iNo):
        while iNo != 0:
            print(iNo % 10)
            iNo = iNo // 10


dobj = DigitX()

print("Enter Number: ")
iValue = int(input())

dobj.DisplayDigits(iValue)
