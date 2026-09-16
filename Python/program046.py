class NumberX:
    def SumFactors(self, iNo):
        iCnt = 0
        iSum = 0

        for iCnt in range(1, (iNo // 2) + 1):
            if (iNo % iCnt) == 0:
                iSum = iSum + iCnt

        print("Summation of Factors:", iSum)


print("Enter the No: ")
iValue = int(input())

nobj = NumberX()

nobj.SumFactors(iValue)
