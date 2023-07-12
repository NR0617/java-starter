package chapter8.test;

import chapter8.inheritance2.Customer;
import chapter8.inheritance2.VIPCustomer;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(0, null);
        customerLee.setCustomerId(10100);
        customerLee.setCustomerName("Lee");

        // 업캐스팅, 묵시적 형변환 -> 반대는 다운캐스팅
        Customer customerKim = new VIPCustomer(0, null);
        customerKim.setCustomerId(10110);
        customerKim.setCustomerName("KIM");

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}
