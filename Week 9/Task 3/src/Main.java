import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {

        printIfPalidrome(" den laks skal ned");


    }

    private static void printIfPalidrome(String bagfra)
    {
        String clean = bagfra.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward++);
            if (forwardChar != backwardChar) {
                System.out.println("failed");
            } else {
                System.out.println(bagfra);
            }
        }


    }
}

