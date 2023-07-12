package chapter8.WithArraylist;
public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        // super(); 컴파일러가 넣어준다. 자신의 바로 위 상위 클래스를 참조하는 키워드. 매개변수가 없으면 디폴트 컨스트럭터 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
        //super.setBonusPoint(1000);
        //bonusPoint= 1000;

        //System.out.println("VIPCustomer(int, String) 호출");
    }
    // overriding 재정의
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
    public int getAgentId() {
        return agentId;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원의 아이디는 " + agentId + " 입니다.";
    }
}
