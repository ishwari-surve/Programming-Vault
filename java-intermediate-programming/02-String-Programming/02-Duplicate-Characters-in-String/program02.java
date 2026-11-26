
/*
===============================================================================
Program Name    : Find Duplicate Characters in a String
Program Number  : 012
Description     : This program identifies duplicate characters in a string
                  and displays their frequency using HashMap.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class program012
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sobj.nextLine();

        str = str.toLowerCase().replaceAll("\\s", "");

        HashMap<Character, Integer> hobj = new HashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            hobj.put(ch, hobj.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nDuplicate Characters:");

        boolean found = false;

        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("No duplicate characters found.");
        }

        sobj.close();
    }
}
