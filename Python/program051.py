def Display(iNo):
    iCnt = 0

    for iCnt in range(0, iNo + 1):
        print(iCnt, end="\t")

    print()


print("Enter number : ")
iValue = int(input())

Display(iValue)
