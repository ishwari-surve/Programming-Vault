/////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////
#include<stdio.h>

/////////////////////////////////////////////////////////////////////////
//
// Function name : AddTwoNumbers
// Input :         Float,Float
// Output :        float
// Description :   Performs addition of two floats
// Date:           08/05/2026
//Author :         Ishwari Vijaykumar Surve
//
/////////////////////////////////////////////////////////////////////////
float AddTwoNumbers(
                       float fNo1,             //First input
                       float fNo2              //Second input
)

{

  float fAns = 0.0f;                           //Variable to store result

  fAns = fNo1 + fNo2;                         //Perform addition

  return fAns;                                
}
/////////////////////////////////////////////////////////////////////////
//
// Application to perform Addition of 2 float values
//
/////////////////////////////////////////////////////////////////////////

int main()
{
   float fValue1 = 0.0f;                  //To store first input
   float fValue2 =0.0f;                 // To store the input
   float fResult = 0.0f;                //  To store the result

     printf("Enter first number :\n");
   scanf("%f",&fValue1);

   printf("Enter second number :\n");
   scanf("%f",&fValue2);

   fResult=AddTwoNumbers(fValue1,fValue2);   //call function

   printf("Addition is : %f\n",fResult);
    
    return 0;
}
/////////////////////////////////////////////////////////////////////////
//
// Input : 10.0  11.0
// Output : 21.0 
//
/////////////////////////////////////////////////////////////////////////
