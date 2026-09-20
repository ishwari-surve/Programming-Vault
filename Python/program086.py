class DigitX:
    def CountEvenOddDigits(self, iNo):
        iDigit = 0
        iCountEven = 0
        iCountOdd = 0

        while iNo != 0:
            iDigit = iNo % 10

            if iDigit % 2 == 0:
                iCountEven = iCountEven + 1
            else:
                iCountOdd = iCountOdd + 1

            iNo = iNo // 10

        print("Number of even digits :", iCountEven)
        print("Number of odd digits :", iCountOdd)


dobj = DigitX()

print("Enter number : ")
iValue = int(input())

dobj.CountEvenOddDigits(iValue)
