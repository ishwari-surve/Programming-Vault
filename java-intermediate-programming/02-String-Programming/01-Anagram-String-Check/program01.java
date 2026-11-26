
/*
===============================================================================
Program Name    : Anagram String Check
Program Number  : 01
Description     : This program checks whether two given strings are
                  anagrams by comparing their character frequencies.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

import java.util.Scanner;
import java.util.Arrays;

class program011
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sobj.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sobj.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("The given strings are Anagrams.");
        }
        else
        {
            System.out.println("The given strings are not Anagrams.");
        }

        sobj.close();
    }
}
