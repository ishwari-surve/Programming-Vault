class Outer
{
    int iValue = 100;

    class Inner
    {
        void Display()
        {
            System.out.println(
                "Outer Class Value : " + iValue); 
        }
    }
}

class program471
{
    public static void main(String A[])
    {
        Outer oobj = new Outer();

        Outer.Inner iobj = oobj.new Inner();

        iobj.Display();
    }
}
