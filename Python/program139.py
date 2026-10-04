def Maximum(Arr,iSize):
    iCnt = 0
    iMax = 0

    iMax = Arr[0]

    for iCnt in range(0,iSize):
        if Arr[iCnt] > iMax:
            iMax = Arr[iCnt]

    return iMax

print("Enter the number of elements :")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements :")

for iCnt in range(0,iLength):
    Brr[iCnt] = int(input())

iRet = Maximum(Brr,iLength)

print("Maximum element is :",iRet)
