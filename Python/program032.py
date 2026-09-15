# For loop iterations

def Display(iNo):

    if iNo < 0:
        print("INVALID INPUT")
        return

    for iCnt in range(iNo, -1, -1):
        print(iCnt)


iValue = int(input("Enter the frequency: "))

Display(iValue)
