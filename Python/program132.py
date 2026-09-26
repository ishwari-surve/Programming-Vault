def LinearSearch(Arr, iSize):
    bFlag = False

    for iCnt in range(iSize):
        if Arr[iCnt] == 11:
            bFlag = True
            break

    return bFlag


iLength = int(input("Enter the number of elements : "))

Brr = []

print("Enter the elements :")
for iCnt in range(iLength):
    Brr.append(int(input()))

bRet = LinearSearch(Brr, iLength)

if bRet == True:
    print("Element is present")
else:
    print("Element is not present")
