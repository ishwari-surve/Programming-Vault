def CallByAddress(iPtr):
    iPtr[0] = iPtr[0] + 1


iValue = [11]

CallByAddress(iValue)

print("Value after function call :", iValue[0])
