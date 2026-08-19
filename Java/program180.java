/* 
Camel Case

Input : my name is ishwari
Output : My Name is Ishwari

Input : my NAME IS  ishwari
Output : My Name is Ishwari

*/

import java.util.*;

class program180
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i + 1] >= 'a' && Arr[i + 1] <= 'z')
                {
                    Arr[i + 1] = (char)(Arr[i + 1] - 32);
                }
            }
        }       
        String output = new String(Arr);
        System.out.println("Updated String is: "+output);
    }
}
