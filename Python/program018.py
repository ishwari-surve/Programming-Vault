def CalculateTicketPrice(iAge):
    if iAge < 0:
        print("Invalid Input")
        return 0

    if iAge >= 0 and iAge <= 5:
        return 0
    elif iAge >= 6 and iAge <= 18:
        return 500
    elif iAge >= 19 and iAge <= 50:
        return 900
    else:
        return 400


iValue = 0
iRet = 0

print("Please enter your age to calculate ticket price :")
iValue = int(input())

iRet = CalculateTicketPrice(iValue)

print("Your ticket price will be", iRet, "ruppes")
