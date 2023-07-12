package chapter8.inheritance2;

public class GoldCustomer extends Customer {
    public GoldCustomer() {
        bonusRatio = 0.05;
    }
    @Override // 어노테이션, 컴파일러에게 역할을 알려줌, 주석과 비슷
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
