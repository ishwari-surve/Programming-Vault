# For loop iterations

def Display(iNo):

    if iNo < 0:
        iNo = -iNo

    for iCnt in range(1, iNo + 1):
        print("Jay Ganesh....")


iValue = int(input("Enter the frequency: "))

Display(iValue)
