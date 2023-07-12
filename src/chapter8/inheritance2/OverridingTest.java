package chapter8.inheritance2;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10012, "LEE");
        int price = customerLee.calcPrice(20000);
        System.out.println("지불 금액은 " + price + "이고 " + customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10013, "Kim", 200);
        price = customerKim.calcPrice(20000);
        System.out.println("지불 금액은 " + price + "이고 " + customerKim.showCustomerInfo());

        // Customer에 있는 것만 참조가 가능
        Customer customerWho = new VIPCustomer(100010, "Who", 100);
        price = customerWho.calcPrice(20000); // But, 재정의가 되었다면 재정의된 메서드가 불린다.(가상메서드)
        System.out.println("지불 금액은 " + price + "이고 " + customerWho.showCustomerInfo());

        Customer customerGold = new GoldCustomer();

    }
}
