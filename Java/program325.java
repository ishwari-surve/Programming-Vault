//Q1 Emplotee Attendance Analyzer (Competative question)
import java.util.*;

class program325
{
    public static void main(String A[])
    {
        int Arr[] = {101,102,103,101,104,102,101,105};

        HashMap <Integer,Integer> frequency = new HashMap<Integer,Integer>();

        for(int id : Arr)
        {
            if(frequency.containsKey(id))
            {
               frequency.put(id,(frequency.get(id) + 1));
            }
            else
            {
                frequency.put(id, 1);
            }
            

        }
        System.out.println(frequency);
    }
}
