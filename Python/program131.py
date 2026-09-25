def CountFrequency(Arr, iSize):
    iCount = 0

    for iCnt in range(iSize):
        if Arr[iCnt] == 11:
            iCount += 1

    return iCount


iLength = int(input("Enter the number of elements : "))

Brr = []

print("Enter the elements :")
for iCnt in range(iLength):
    Brr.append(int(input()))

iRet = CountFrequency(Brr, iLength)

print("Frequency :", iRet)
