//Accept two numbers from user and check whether it is even or odd
/*
    START
        Accept number as No
        If No is completely divisible by 2
            then print Even
        otherwise 
            print odd
    STOP

    START
        Accept number as No
        Divide No by 2
        If remander is 0 
            then print as Even 
        otherwise
             print as Odd
    STOP

*/

#include<stdio.h>

void CheckEvenOdd(int iNo)
{
    int iRemainder = 0;
   int iRemainder =iNo % 2;

    if(iRemainder == 0)
   {
     printf("Number is Even : \n");

   }
   else
   {
     printf("Number is odd : \n");
   }
    return 0;

}
int main()
{
   int iValue = 0;
   

   printf("Enter number :\n");
   scanf("%d",&iValue);

   CheckEvenOdd(iValue);

   return 0;

   

   
}
