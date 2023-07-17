package chapter11.classEx;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person = new Person(); //static 로딩 -> 없으면 컴파일에서 에러
        Class pClass = person.getClass();

        System.out.println(pClass.getName());

        Class pClass2 = Person.class; //static
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("chapter11.classEx.Person"); //동적 로딩 -> 없으면 런타임에서 에러
        System.out.println(pClass3.getName());

        Person p2 = (Person) pClass.newInstance();
    }
}
