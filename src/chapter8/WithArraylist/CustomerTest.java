package chapter8.WithArraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10011, "신사임당");
        GoldCustomer customerKim = new GoldCustomer(10012, "김유신");
        GoldCustomer customerHong = new GoldCustomer(10013, "홍길동");
        VIPCustomer customerHan = new VIPCustomer(10014, "한석봉", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerKim);
        customerList.add(customerHong);
        customerList.add(customerHan);
        System.out.println("=========고객정보출력========");
        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println();
        System.out.println("=========할인율과 보너스포인트 결과========");
        int price = 10000;
        for(Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + " 원을 지불하셨습니다");
            System.out.println(customer.showCustomerInfo());

        }

    }
}
