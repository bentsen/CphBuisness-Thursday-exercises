import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        myDog.setOwnerName(new Owner("Henning"));
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.getOffSpring().add("woodiesnoopie");
        myDog.getOffSpring().add("woodiesfido");
        // print alle hvalpe
        ArrayList<String> myOff = myDog.getOffSpring();
        for (String myD: myOff)
        {
            System.out.println(myD);
        }

       // System.out.println(Arrays.toString(myOff));
        // print ejeren
       System.out.println("hunden "+ myDog.getName() + " er ejet af " + myDog.getOwnerName());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
       // String resString = myDog.feedDog();
        // System.out.println(resString);
    }

}
