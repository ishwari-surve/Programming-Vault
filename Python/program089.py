class DigitX:
    def SumEvenDigits(self, iNo):
        iDigit = 0
        iSum = 0

        while iNo != 0:
            iDigit = iNo % 10
            if iDigit % 2 == 0:
                iSum = iSum + iDigit
            iNo = iNo // 10

        return iSum


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

iRet = dobj.SumEvenDigits(iValue)

print("Summation of even digits :", iRet)
