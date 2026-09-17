class NumberX:
    def CheckPerfect(self, iNo):
        iCnt = 0
        iSum = 0

        for iCnt in range(1, (iNo // 2) + 1):
            if (iNo % iCnt) == 0:
                iSum = iSum + iCnt

            if iSum > iNo:
                break

        if iSum == iNo:
            return True
        else:
            return False


print("Enter number : ")
iValue = int(input())

nobj = NumberX()
bRet = nobj.CheckPerfect(iValue)

if bRet == True:
    print("It is perfect")
else:
    print("It is not perfect")
