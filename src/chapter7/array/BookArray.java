package chapter7.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("해리포터", "조앤K");
        library[2] = new Book("감자감자", "고양이");
        library[3] = new Book("태백산맥3", "조정래");
        library[4] = new Book("태백산맥4", "조정래");

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
        for(int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

        Book[] copiedLibrary = new Book[5];

        System.arraycopy(library, 0, copiedLibrary, 1, 4);

        for(int i = 0; i < copiedLibrary.length; i++) {
            if(copiedLibrary[i] == null) {
                copiedLibrary[i] = new Book("나는 카피된 배열의 빈칸", "고구마");
            }
            copiedLibrary[i].showBookInfo();
        }
    }
}
