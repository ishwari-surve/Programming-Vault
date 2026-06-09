def Checkeven(No):
    return(No % 2 == 0)

def Increment(No):
    return No+1

def main():
    Data = [11,10,15,20,22,27,30]
    print("Actual Data id:",Data)

    FData =list(filter(Checkeven,Data))
    print("Data after filter is:",FData)

    MData =list(map(Increment,FData))
    print("Data after map is:",MData)


if __name__ == "__main__":
    main()