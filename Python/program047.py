class NumberX:
    def SumFactors(self, iNo):
        iCnt = 0
        iSum = 0

        for iCnt in range(1, (iNo // 2) + 1):
            if (iNo % iCnt) == 0:
                iSum = iSum + iCnt

        return iSum


print("Enter number :")
iValue = int(input())

nobj = NumberX()

iRet = nobj.SumFactors(iValue)

print("Summation of Factors:", iRet)
