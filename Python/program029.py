# For loop iterations

def Display(iNo):

    if iNo < 0:
        print("INVALID INPUT")
        return

    for iCnt in range(1, iNo + 1):
        print(iCnt, ": Jay Ganesh....")


iValue = int(input("Enter the frequency: "))

Display(iValue)
