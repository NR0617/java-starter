package chapter7.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥1", "조정래");
        bookArray1[1] = new Book("태백산맥2", "조정래");
        bookArray1[2] = new Book("태백산맥3", "조정래");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        //System.arraycopy(bookArray1, 0, bookArray2, 0, 3); // 얖은 복사

        //깊은 복사를 하고 싶을땐 아래와 같이 복사(getter, setter)
        for(int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        for(int i = 0; i<bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        System.out.println("=====");

        bookArray1[0].setBookName("나는 무");
        bookArray1[0].setAuthor("무말랭이");

        for(int i = 0; i<bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
        System.out.println("=====");
        // 얕은 복사 vs 깊은 복사
        for(int i = 0; i<bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        String[] strArr = {"Java", "Android", "C"};

        for(String s : strArr) {
            System.out.println(s);
        }

        int[] arr = {1, 2, 3, 4, 5};
        for(int num : arr) {
            System.out.println(num);
        }
    }
}
