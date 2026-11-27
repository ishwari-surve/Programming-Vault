
/*
===============================================================================
Program Name    : First Non-Repeating Character in a String
Program Number  : 003
Description     : This program finds the first character that appears only
                  once in a given string using LinkedHashMap.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

class program003
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sobj.nextLine();

        str = str.toLowerCase().replaceAll("\\s", "");

        LinkedHashMap<Character, Integer> hobj = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            hobj.put(ch, hobj.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;

        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println("First Non-Repeating Character: " + entry.getKey());
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("No non-repeating character found.");
        }

        sobj.close();
    }
}
