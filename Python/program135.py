def LinearSearch(Arr,iSize,iNo):
    iCnt = 0
    iCount = 0

    for iCnt in range(0,iSize):
        if Arr[iCnt] == iNo:
            iCount = iCount + 1

    if iCount == 0:
        return False
    else:
        return True

print("Enter the number of elements : ")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0,iLength):
    Brr[iCnt] = int(input())

print("Enter the element that you want to search : ")
iValue = int(input())

bRet = LinearSearch(Brr,iLength,iValue)

if bRet == True:
    print("Element is present")
else:
    print("Element is not present")
