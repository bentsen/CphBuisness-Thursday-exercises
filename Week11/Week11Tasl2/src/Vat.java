public class Vat {
    final static int PRCVAT = 25;


    public double doVAT(double number)
    {
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
