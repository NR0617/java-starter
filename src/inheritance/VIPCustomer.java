package inheritance;

public class VIPCustomer extends Customer{
    VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        grade = "VIP Gold";

    }

    public int calcPrice(int price) {
        this.totalPrice += price*0.7;
        return this.totalPrice;
    }

}
