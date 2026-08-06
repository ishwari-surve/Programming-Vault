import threading
import time 

def SumEven(No):
    sum=0
    for i in range(2,No+1,2):
        sum=sum + i
    print("Even Sum is:",sum)

def Sumodd(No):
    sum=0
    for i in range(1,No+1,2):
        sum=sum + i
    print("Odd Sum is:",sum)


def main():
    start_time= time.time()
    SumEven(10000000)
    Sumodd(100000000)
    end_time=time.time()

    print("Time required:",end_time-start_time)   
  
if __name__=="__main__":
    main()
