import java.util.ArrayList;

public class Dog
{
   private String name;
   private Owner ownerName;
   private Boolean isHungry;
   ArrayList<String> offSpring = new ArrayList<>();

    public Dog(String name, boolean isHungry)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Owner getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(Owner ownerName)
    {
        this.ownerName = ownerName;
    }

    public ArrayList<String> getOffSpring()
    {
        return offSpring;
    }

    public void feedDog()
    {
        if (isHungry = true)
        {
            System.out.println("Dog in Hungry");
        }
        if (isHungry = false)
        {
            System.out.println("Dog is not Hungry");
        }
    }
}
