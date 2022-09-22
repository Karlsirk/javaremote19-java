/**
 * Examples of Arrays
 *
 * @author Karl Sirkas
 */
public class Array {
    public static void main(String[] args) {

    int a = 9;

    //Note array index always starts with 0
        //
    int [] b = {9, 27, 40, 20, 839, 11000, 27, 40};

    String[] fruits = {"apple", "orange", "mango", "apple", "banana", "mango"};

    System.out.println(fruits[0]);
    System.out.println(b[4]);

    //System.out.println(fruits[3]); //Array index out of bound

        System.out.println(b.length); //return the number of values in the array

        System.out.println(b.length - 1); //returns arrays last index

        String[] veggies = new String [5]; //new object

        veggies[3] = "Potato";
        veggies[4] = "Tomato";

        System.out.println(veggies[1]);

        String[] food = new String[]  {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];


        //processing array
        //conventional for-loop
        for(int i=0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop
        for(String fruit: fruits) { //String : String[]  int : int[]
            System.out.println(fruit);
        }

        //Find the largest element in the array
        //Brute-force method
        int result = b[0]; //9
        for(int x: b) {
            if(x > result){
                result = x;
            }

        }

        System.out.print(result);
        System.out.println("");

        //Homework4
        //To find smallest in the array (b)

        //Multi-dimensional array
        //20 array
        int[][] array2d = new  int[3][3];
        //Row-1
        array2d[0][0] = 1;
        array2d[0][1] = 0;
        array2d[0][2] = 1;
        //Row-2
        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;
        //Row-3
        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        int[][] array2dVer2 ={ {1, 0, 1},{2, 10, 9},{4, 9, 8}};

        for(int x = 0; x < 3;x++) {
            for(int y = 0; y < 3; y++) {
                System.out.print(array2d[x][y] + " ");
            }
            System.out.println();
        }

        //3D array = 1D + 2D array
        //1D => number of tables
        //2D array => array with rows and columns
        int[][][] array3d = new int[3][3][3];

        //Table-1
        //Row-1
        array3d[0][0][0] = 1;
        array3d[0][0][1] = 0;
        array3d[0][0][2] = 1;

        int[][][] array3dVer2 = {
                                {{1, 0, 1}, {1, 8, 0}, {2, 5, 7}},
                                {{9, 8, 7}, {5, 8, 9}, {3, 5, 0}},
                                {{5, 6, 2}, {4, 5, 7}, {2, 6, 8}},
                                 };
System.out.println("\n");
        for (int x= 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for(int c = 0; c < 3; c++) {
                System.out.print(array3dVer2[x][y][c] + "\t");
                }

                System.out.print("\n");

    }
}
    }
}