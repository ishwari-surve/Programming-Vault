
def EmployeeInfo(Name,Age,Salary ,City="Mumbai"):
    print("Name :",Name)
    print("Age :",Age)
    print("Salary :",Salary)
    print("City :",City)


def main():
   #Keyword argumnets
    EmployeeInfo("Rahul",26,2000.50) #correct
    EmployeeInfo("Rahul",26,2000.50,"Pune")
   


if __name__ =="__main__":
    main()