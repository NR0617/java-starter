package chapter11.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);

        String str5 = new String("java");
        String str6 = new String("android");
        System.out.println(System.identityHashCode(str5));

        str5 = str5.concat(str6);
        System.out.println(str5);
        // str5를 새로 만들어서 메모리를 할당하기때문에 메모리 낭비가 발생할 수 있음 -> StringBuilder, StringBuffer사용하기
        System.out.println(System.identityHashCode(str5));


    }
}
