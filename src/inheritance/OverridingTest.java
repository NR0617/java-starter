package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.calcPrice(10000);
        customerLee.showCustomerInfo();

        VIPCustomer customerKim = new VIPCustomer(10011, "Kim");
        customerKim.calcPrice(5000000);
        customerKim.showCustomerInfo();

        Customer customerWho = new VIPCustomer(10012, "Who");
        //재정의된 메서드가 불린다
        customerWho.calcPrice(300000);
        customerWho.showCustomerInfo();
    }
}
