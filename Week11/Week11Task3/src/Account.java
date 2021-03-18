public class Account
{
    private String Transcation_date = "1/3/09 14:44";
    private String Product = "Product1";
    private float Price = 1200;
    private String PaymentType = "Visa";
    private long CardNumber = 4593781145107322L;
    private String name = "Gouya";
    private String city = "Echuca";
    private String state = "victoira";
    private String country = "Australia";
    private String Account_Created = "9/25/05 21:13";
    private String Last_Login = "1/3/09 14:22";
    private double Lat = -36.1333333;
    private double Long = 144.75;

public Account(String name, String paymentType, String country, Long cardNumber)
        {
            this.name = name;
            this.PaymentType = paymentType;
            this.country = country;
            this.CardNumber = cardNumber;

        }

    public long getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(long cardNumber) {
        CardNumber = cardNumber;
    }
}
