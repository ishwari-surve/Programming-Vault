
def EmployeeInfo(Name,Age,Salary,City):
    print("Name :",Name) 
    print("Age :",Age)
    print("Salary :",Salary)
    print("City :",City)


def main():
    #Positional
    #EmployeeInfo("Ishwari",26,2000.50,"Pune") #correct
    #EmployeeInfo(26,"Ishwari","Pune",2000.50) #wrong

#Keyword argumnets
    EmployeeInfo(Age=26,Name="Ishwari",City="Pune",Salary=2000.50) #correct
   


if __name__ =="__main__":
    main()
  
