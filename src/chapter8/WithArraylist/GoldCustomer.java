package chapter8.WithArraylist;

public class GoldCustomer extends Customer {
    double saleRatio;
    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
        //System.out.println("GOLDCustomer(int, String) 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
