import java.util.ArrayList;

public class Main {
    public static ArrayList<Account> myAccount = new ArrayList<>();

    public static void main(String[] args)
    {
        Account account1 = new Account("Mikkel","MasterCard","Denmark",4593781145107322L);
        Account account2 = new Account("Christian","Visa","Denmark",4393786144107822L);
        Account account3 = new Account("Kim","Paypal","Denmark",4592781445153322L);

        myAccount.add(account1);
        myAccount.add(account2);
        myAccount.add(account3);
       
    }
}
