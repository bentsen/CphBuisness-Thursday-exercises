public class Car
{
    int make;
    String model;
    int year;
    String bodyStyle;
    Driver driver = new Driver("",12);

    Car(int make, String model,int year,String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }


    public Driver getDriver()
    {
        return driver;
    }

    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}
