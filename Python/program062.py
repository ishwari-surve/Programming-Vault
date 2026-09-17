def Display(iNo):
    iCnt = 0

    for iCnt in range(-iNo, 1, 2):
        print(iCnt, end="\t")

    print()


print("Enter number : ")
iValue = int(input())

Display(iValue)
