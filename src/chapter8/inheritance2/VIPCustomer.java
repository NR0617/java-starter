package chapter8.inheritance2;

public class VIPCustomer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    public int agentId;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이고, 보너스 포인트는" + bonusPoint + "입니다.";
    }
    public int getCustomerId() {
        return customerId;
    }
    public int setCustomerId(int customerId) {
        this.customerId = customerId;
        return this.customerId;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}
