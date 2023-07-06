package chapter6.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        Company c3 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3 == c2);
        // Company c4 = new Company(); // error

        Calendar cal = Calendar.getInstance();
    }
}
