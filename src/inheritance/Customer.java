package inheritance;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected int totalPrice;

    protected String grade = "silver";
    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
    public int calcPrice(int price) {
        this.totalPrice += price*0.9;
        return this.totalPrice;
    }
    public void showCustomerInfo() {
        System.out.println(customerId + "  " + grade+"  "+ customerName + "  " + totalPrice);
    }
}
