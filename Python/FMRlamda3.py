from functools import reduce


def main():
    Data = [11,10,15,20,22,27,30]
    print("Actual Data id:",Data)

    FData =list(filter((lambda No :(No % 2 == 0)),Data))
    print("Data after filter is:",FData)

    MData =list(map((lambda No :No + 1),FData))
    print("Data after map is:",MData)

    RData = reduce((lambda A,B:A+B),Data)
    print("Data after reduce is :",RData)


if __name__ == "__main__":
    main()