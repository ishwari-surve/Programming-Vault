class NumberX:
    def DisplayFactors(self, iNo):
        iCnt = 0

        for iCnt in range(1, iNo + 1):
            if (iNo % iCnt) == 0:
                print(iCnt)


print("Enter number :")
iValue = int(input())

nobj = NumberX()

nobj.DisplayFactors(iValue)
