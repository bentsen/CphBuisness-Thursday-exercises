import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args) throws FileNotFoundException
    {
        printPartOfWord("københavn",6,4);


    }

    private static void printPartOfWord(String ordet, int index, int length)
    {
        try
        {
            System.out.println(ordet.substring(index,index+length));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            if (index < ordet.length())
            {
                System.out.println(ordet.substring(index));
            }

            if (index > ordet.length())
            {
                System.out.println("failed!");
            }
        }
    }
}
