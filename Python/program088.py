class DigitX:
    def SumDigits(self, iNo):
        iSum = 0

        while iNo != 0:
            iSum = iSum + (iNo % 10)
            iNo = iNo // 10

        return iSum


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

iRet = dobj.SumDigits(iValue)

print("Summation of digits :", iRet)
