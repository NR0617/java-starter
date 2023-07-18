package chapter14.exception;

public class IdFormatTest {
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IDFormatException {
        if(userId == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다");
        } else if (userId.length() < 8 || userId.length() > 10) {
            throw new IDFormatException("아이디는 8자 이상 10자 이하로 쓰세요");

        }
        this.userId = userId;
    }

    private String userId;
    public static void main(String[] args) {

        IdFormatTest idTest = new IdFormatTest();
        String userId = null;
//        try {
//            idTest.setUserId(userId);
//        } catch (IDFormatException e) {
//            throw new RuntimeException(e);
//        }

        userId = "1234567";
        try {
            idTest.setUserId(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
    }
}
