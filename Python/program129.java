def SumEven(Arr,iSize):
    iSum = 0
    iCnt = 0

    for iCnt in range(0,iSize):
        if Arr[iCnt] % 2 == 0:
            iSum = iSum + Arr[iCnt]

    return iSum

print("Enter the number of elements : ")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0,iLength):
    Brr[iCnt] = int(input())

iRet = SumEven(Brr,iLength)

print("Even elements summation :",iRet)
