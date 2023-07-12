package chapter8.inheritance2;

public class Customer {
    protected int customerId; // protected는 상속관계에서 public처럼 사용할 수 있다(가시성,패키지달라도 가능)
    protected String customerName;
    protected String customerGrade;
    int bonusPoint; // 디폴트, 같은 패키지 내에서 가시성있음
    double bonusRatio;

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
//    public Customer() {
//        // super(); Object 클래스(최상위)를 상속받음
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer(); 호출");
//
//    }

    public Customer(int customerId, String customerName) {

        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "Silver";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String); 호출");
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
