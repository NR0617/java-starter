package chapter10.interfaceEx;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();
        // 가상메서드. customer의 인스턴스가 바인딩되어 있기때문에 Buy의 order가 아니라 customer의 order가 불린다
        buyer.order();
        seller.order();
    }

}
