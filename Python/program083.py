class DigitX:
    def CountDigits(self, iNo):
        iDigit = 0
        iCount = 0

        while iNo != 0:
            iDigit = iNo % 10

            if iDigit == 7:
                iCount = iCount + 1

            iNo = iNo // 10

        return iCount


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

iRet = dobj.CountDigits(iValue)

print("Number of digits are :", iRet)
