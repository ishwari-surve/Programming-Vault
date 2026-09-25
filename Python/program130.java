def CountOdd(Arr, iSize):
    iCount = 0

    for iCnt in range(iSize):
        if Arr[iCnt] % 2 != 0:
            iCount += 1

    return iCount


iLength = int(input("Enter the number of elements : "))

Brr = []

print("Enter the elements :")
for iCnt in range(iLength):
    Brr.append(int(input()))

iRet = CountOdd(Brr, iLength)

print("Odd elements are :", iRet)
