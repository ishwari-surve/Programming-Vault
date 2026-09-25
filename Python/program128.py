def CountEven(Arr,iSize):
    iCount = 0
    iCnt = 0

    for iCnt in range(0,iSize):
        if Arr[iCnt] % 2 == 0:
            iCount = iCount + 1

    return iCount

print("Enter the number of elements : ")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0,iLength):
    Brr[iCnt] = int(input())

iRet = CountEven(Brr,iLength)

print("Even elements are :",iRet)
