def Display(iNo):
    iCnt = 0

    for iCnt in range(0, iNo):
        print(iCnt, end="\t")

    print()


print("Enter number : ")
iValue = int(input())

Display(iValue)
