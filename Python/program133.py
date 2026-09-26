def LinearSearch(Arr,iSize):
    iCnt = 0
    bFlag = False

    for iCnt in range(0,iSize):
        if Arr[iCnt] == 11:
            bFlag = True
            break

    return bFlag

print("Enter the number of elements : ")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0,iLength):
    Brr[iCnt] = int(input())

bRet = LinearSearch(Brr,iLength)

if bRet == True:
    print("Element is present")
else:
    print("Element is not present")
