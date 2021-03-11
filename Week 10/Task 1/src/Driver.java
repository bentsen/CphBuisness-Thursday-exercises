public class Driver
{
    String name;
    int age;

    Driver(String name, int age)
    {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString()
    {
        return "Driver{" +
                "is driven by='" + name + '\'' +
                '}';
    }
}
