def Display(Arr, iSize):
    iCnt = 0

    print("Elements of the array are : ")

    for iCnt in range(0, iSize):
        print(Arr[iCnt])


iLength = 0
iCnt = 0

print("Enter number of elements : ")
iLength = int(input())

Brr = [0] * iLength

print("Enter the elements : ")

for iCnt in range(0, iLength):
    Brr[iCnt] = int(input())

Display(Brr, iLength)
