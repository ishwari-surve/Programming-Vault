import java.util.*;

class program381
{
    public static void main(String A[])
    {
        PriorityQueue<Integer> pobj =
            new PriorityQueue<Integer>();

        pobj.add(30);
        pobj.add(10);
        pobj.add(20);

        while(!pobj.isEmpty())
        {
            System.out.println(pobj.poll());
        }
    }
}
