package chapter8.inheritance2;

public class CustomerTest2 {
    public static void main(String[] args) {
//        Customer customerPark = new Customer();
//        customerPark.setCustomerId(10101);
//        customerPark.setCustomerName("PARK");

        VIPCustomer customerHyun = new VIPCustomer(0, null);
        customerHyun.setCustomerId(10111);
        customerHyun.setCustomerName("HYUN");
        //customerHyun.agentId = 1;

        customerHyun.bonusPoint = 1000;
        //customerHyun.setBonusPoint(1000);


        //System.out.println(customerPark.showCustomerInfo());
        System.out.println(customerHyun.showCustomerInfo());
    }
}
