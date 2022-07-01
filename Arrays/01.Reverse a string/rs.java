import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(system.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}

class Reverse
{
    public static String reverseWord(String str)
    {
        return new StringBuilder(str).reverse().tostring();
    }
}