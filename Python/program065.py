class NumberX:
    def CheckPrime(self, iNo):
        iCnt = 0

        for iCnt in range(2, (iNo // 2) + 1):
            if (iNo % iCnt) == 0:
                break

        if iCnt < iNo // 2:
            return False
        else:
            return True


iValue = int(input("Enter number : "))

nobj = NumberX()

bRet = nobj.CheckPrime(iValue)

if bRet == True:
    print("It is prime")
else:
    print("It is not prime")
