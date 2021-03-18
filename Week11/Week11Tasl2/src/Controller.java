public class Controller
{
public void runController()
{
    Dialog dialog = new Dialog();
    Vat vat = new Vat();
    View view = new View();

    double userIn = dialog.doDialogs();
    double moms = vat.doVAT(userIn);
    view.doView(moms, View.MSG);
}

}
