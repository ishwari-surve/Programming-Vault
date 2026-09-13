def AddTwoNumbers(fNo1, fNo2):
    fAns = 0.0

    fAns = fNo1 + fNo2

    return fAns


fValue1 = 0.0
fValue2 = 0.0
fResult = 0.0

print("Enter first number :")
fValue1 = float(input())

print("Enter second number :")
fValue2 = float(input())

fResult = AddTwoNumbers(fValue1, fValue2)

print("Addition is :", fResult)
