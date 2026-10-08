import java.util.*;

class program419
{
    public static void main(String A[])
    { 
        int iNo = 40; 
        int iPos = 1; 
 
        while((iNo & 1) == 0)
        {
            iNo = iNo >> 1;
            iPos++;
        }

        System.out.println("Position : " + iPos);
    }
}
