//for loop iterations
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    //Filter 
    if(iNo < 0)
    {
       printf("INVALID INPUT");
       return; 
    }
     for(iCnt = 1; iCnt<=iNo; iCnt++)
    {
      printf("%d : Jay Ganesh....\n",iCnt); //numbering eg : 1.Jay Ganesh...
    }
}
int main()
{
    int iValue = 0;

    printf("Enter the frequency :");
    scanf("%d",&iValue);

    Display(iValue);
    
    return 0;
   
}
