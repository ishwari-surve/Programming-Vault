
/*
===============================================================================
Program Name    : Reverse Each Word in a Sentence
Program Number  : 05
Description     : This program reverses each word in a sentence while
                  maintaining the original order of words.

Language        : Java
Author          : Ishwari Vijaykumar Surve
===============================================================================
*/

import java.util.Scanner;

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sobj.nextLine();

        String words[] = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++)
        {
            StringBuilder word = new StringBuilder(words[i]);

            result.append(word.reverse());

            if(i < words.length - 1)
            {
                result.append(" ");
            }
        }

        System.out.println("Original Sentence : " + str);
        System.out.println("Reversed Words   : " + result);

        sobj.close();
    }
}

