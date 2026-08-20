// Anagram
import java.util.*;

class program194
{
    public static boolean CheckAnagram(String str1,String str2)
    {
       return true;
    }
    public static void main(String A[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String :");
        String str1 = sobj.nextLine();

        System.out.println("Enter Second String :");
        String str2 = sobj.nextLine();

        boolean bRet = false;

        bRet = CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
              System.out.println("Strings are not  anagram");
        }       
    
        
    }
}
