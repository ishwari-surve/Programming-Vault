
/*
===============================================================================
Program Name    : Character Frequency in a String
Program Number  : 014
Description     : This program counts the frequency of each character in a
                  given string using LinkedHashMap.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

class program014
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

        System.out.println("\nCharacter Frequency:");

        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sobj.close();
    }
}
