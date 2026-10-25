import java.io.*;

class program466
{
    public static void main(String A[])
    {
        File fobj = new File(".");

        File Arr[] = fobj.listFiles();

        int iCount = 0;

        for(File file : Arr)
        {
            if(file.isFile())
            {
                iCount++;
            }
        }

        System.out.println("Files : " + iCount);
    }
}
