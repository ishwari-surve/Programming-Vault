class NumberX:
    def DisplayFactors(self, iNo):
        iCnt = 0

        for iCnt in range(1, (iNo // 2) + 1):
            if (iNo % iCnt) == 0:
                print(iCnt)


print("Enter the No: ")
iValue = int(input())

print("Factors are: ")

nobj = NumberX()

nobj.DisplayFactors(iValue)
