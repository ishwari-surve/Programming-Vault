def Summation(Arr, iSize):
    iCnt = 0
    iSum = 0

    for iCnt in range(0, iSize):
        iSum = iSum + Arr[iCnt]

    return iSum


iLength = 4
iCnt = 0

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0, iLength):
    Brr[iCnt] = int(input())

iRet = Summation(Brr, iLength)

print("Addition of all elements :", iRet)
