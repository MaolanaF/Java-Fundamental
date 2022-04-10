package PolymorphismInheritance;

/**
 *
 * @author Maolana
 */

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    
    @Override
    public double pay(){
        double commision = (totalSales * commissionRate)/100;
        double payment = super.pay() + commision;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
