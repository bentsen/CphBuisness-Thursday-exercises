class Main
{
  public static boolean happy = true;

  public static void main(String [] args) 
  {
   if (iAmHappy())
   {
     uppercase("I clap my hands");
     int sum2;
     sum2 = sum(2,5);
     System.out.println(sum2);
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

    
   if (firstletter("Hej"))
    {
      System.out.println("You started with Uppercase");
    }
    else 
    {
      System.out.println("You forgot to start with Uppercasae");
    }

  }


    public static boolean iAmHappy()
    {
        // fill out what is missing here: 
        if (happy == true)
        {
        return true;
        }
        return false;
    }


    public static int sum(int a, int b)
    {
        return a+b;
    }   
    
    public static void uppercase(String a)
    {
        System.out.println(a.toUpperCase());
    }

    public static boolean firstletter(String a)
    {
        if(Character.isUpperCase(a.charAt(0)))
        {
          return true;
        }
        return false;
    }

    

}