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
     for(iCnt = iNo; iCnt>=0; iCnt--) // loop backward 4,3,2,1
    {
      printf("%d\n ",iCnt); // number line
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
