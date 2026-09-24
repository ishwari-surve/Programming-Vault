def Display(Arr, iSize):
    iCnt = 0

    for iCnt in range(0, iSize):
        print(Arr[iCnt])


iLength = 4
iCnt = 0

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0, iLength):
    Brr[iCnt] = int(input())

Display(Brr, iLength)
