class DigitX:
    def SumDigits(self, iNo):
        iDigit = 0
        iSum = 0

        while iNo != 0:
            iDigit = iNo % 10
            iSum = iSum + iDigit
            iNo = iNo // 10

        return iSum


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

iRet = dobj.SumDigits(iValue)

print("Summation of digits :", iRet)
