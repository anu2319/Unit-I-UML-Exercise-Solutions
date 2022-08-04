public class TaxWhiz
{
    private double taxRate;

    public TaxWhiz(double taxRate)
    {
        this.taxRate = taxRate;
    }

    public double calcTax(double purchase)
    {
        purchase = purchase;
        return purchase*taxRate;
    }

    public static void main(String[] args)

    {
        TaxWhiz taxWhiz = new TaxWhiz(0.04);
        System.out.println(taxWhiz.calcTax(100));

    }
}
