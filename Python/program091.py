class DigitX:
    def CheckPallindrome(self, iNo):
        iDigit = 0
        iRev = 0
        iTemp = 0

        iTemp = iNo

        while iNo != 0:
            iDigit = iNo % 10
            iRev = (iRev * 10) + iDigit
            iNo = iNo // 10

        if iRev == iTemp:
            return True
        else:
            return False


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

bRet = dobj.CheckPallindrome(iValue)

if bRet == True:
    print("Number is pallindrome")
else:
    print("Number is not pallindrome")
