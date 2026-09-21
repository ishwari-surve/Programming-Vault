class DigitX:
    def ReverseNumber(self, iNo):
        iDigit = 0
        iRev = 0

        while iNo != 0:
            iDigit = iNo % 10
            iRev = (iRev * 10) + iDigit
            iNo = iNo // 10

        return iRev


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

iRet = dobj.ReverseNumber(iValue)

print("Reverse number is :", iRet)
