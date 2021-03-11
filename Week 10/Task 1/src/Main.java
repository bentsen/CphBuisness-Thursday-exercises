public class Main
{

    public static void main(String[] args)
    {
        Driver driver = new Driver("Mikkel",22);
        Car car = new Car(2001,"Hondacivic",2001,"Sportsback");
        Car car2 = new Car(2001,"MercedezBenz",2018,"Limo");

        car.setDriver(driver);
        car2.setDriver(driver);

        System.out.println(car + "" +car.driver);
        System.out.println(car2 + "" + car2.driver);

    }
}
