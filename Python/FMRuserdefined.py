from functools import reduce


Checkeven  =lambda No :(No % 2 == 0)

Increment=lambda No :No + 1

Add = lambda A,B:A+B

def filterX(Task,Elements):
    Result = list(    )

    for no in Elements:
        Ret =  Task(no)

        if(Ret == True):
            Result.append(no)

    return Result


def main():
    Data = [11,10,15,20,22,27,30]
    print("Actual Data id:",Data)

    FData =list(filterX(Checkeven,Data))
    print("Data after filter is:",FData)

    MData =list(map(Increment,FData))
    print("Data after map is:",MData)

    RData = reduce(Add,Data)
    print("Data after reduce is :",RData)


if __name__ == "__main__":
    main()

