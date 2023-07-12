package chapter8.inheritance2;

public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        // super(); 컴파일러가 넣어준다. 자신의 바로 위 상위 클래스를 참조하는 키워드. 매개변수가 없으면 디폴트 컨스트럭터 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        //super.setBonusPoint(1000);
        //bonusPoint= 1000;

        System.out.println("VIPCustomer(int, String); 호출");
    }

    public int getAgentId() {
        return agentId;
    }
}
