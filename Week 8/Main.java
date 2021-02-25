class Main
{
    public static void main(String[] args) 
    {
           emptyString();
           ord("hej");
           sætning("Mikkel",22);
    } 

    public static void emptyString()
    {
        System.out.println("");
    }
        

    public static void ord(String something)
    {
        System.out.println(something);
    }


    public static void sætning(String name, int age)
    {
        System.out.println("My name is " + name + ", I am " + age + " years old");
    }
}