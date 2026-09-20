class DigitX:
    def CountEvenDigits(self, iNo):
        iDigit = 0
        iCount = 0

        while iNo != 0:
            iDigit = iNo % 10

            if iDigit % 2 == 0:
                iCount = iCount + 1

            iNo = iNo // 10

        return iCount


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

iRet = dobj.CountEvenDigits(iValue)

print("Number of even digits are :", iRet)
