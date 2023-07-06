package chapter7.array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //int[][] array = new int[2][3];
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        //System.out.println(array.length);
        //System.out.println(array[0].length);
        //System.out.println(array[1].length);

        for(int i = 0; i< array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }

        char[][] alphabets = new char[13][2];
        char ch = 'A'; //65
        //System.out.println((int)ch);
        for(int i = 0; i < alphabets.length; i++) {
            for(int j = 0; j < alphabets[i].length; j++) {
                alphabets[i][j] = ch++;
            }
        }
        for(int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
//            for(int j = 0; j < alphabets[i].length; j++) {
//                System.out.println(alphabets[i][j]);
//            }
        }

    }
}
