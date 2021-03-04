import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;

    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException
    {
        printLongestWord();
    }


    //TASK 2
    private static void printLongestWord() throws FileNotFoundException
    {
        String longest = "";
        String[] splitarray = new String[0];
        File file = new File("src/Data.txt");
        scan = new Scanner(file);
        int i = 0;
        while(scan.hasNextLine())
        {
            splitarray = scan.nextLine().split("\\.");
            longest = splitarray[0];
            for (String sentence: splitarray)
            {
                if (longest.length() < sentence.length())
                {
                    longest = sentence;
                }
            }
            i++;

        }
        System.out.println(longest);

    }



}