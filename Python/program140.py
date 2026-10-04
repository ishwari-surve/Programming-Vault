def Minimum(Arr,iSize):
    iCnt = 0
    iMin = 0

    iMin = Arr[0]

    for iCnt in range(0,iSize):
        if Arr[iCnt] < iMin:
            iMin = Arr[iCnt]

    return iMin

print("Enter the number of elements :")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements :")

for iCnt in range(0,iLength):
    Brr[iCnt] = int(input())

iRet = Minimum(Brr,iLength)

print("Minimum element is :",iRet)
