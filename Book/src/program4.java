import java.io.*;

public class program4
{
    public static void main(String args[])
    {
        DataInputStream in= new DataInputStream(System.in);
        int intNumber = 0;
        float floatNumber = 0.0f;
        try
        {
            System.out.println("Enter an Integer: ");
            intNumber = Integer.parseInt(in.readline());
            System.out.println("Enter a float number: ");
            floatNumber =
                    Float.valueof(in.readline()).floatValue();
        }
        catch (Exception e) { }
        System.out.println("intNumber = " + intNumber);
        System.out.println("floatNumber = " + floatNumber);
    }
}