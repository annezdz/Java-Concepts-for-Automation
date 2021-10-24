package arrays;

public class TwoArray {

    public static void main(String[] args) {

        /*
        * int[][] myArray = new int [2][3];
        * Cada index [2] contém [3] indexes
        *
        * */

        int[][] myArray = new int [2][3];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;

        myArray[1][0] = 4;
        myArray[1][1] = 5;
        myArray[1][2] = 6;

        System.out.println(myArray[1][1]);
        System.out.println(myArray.length);

        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[i].length;j++){
                System.out.println(myArray[i][j]);
            }
        }

    }
}
