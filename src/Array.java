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
        for(String fruit: fruits) {
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

        //Homework4
        //To find smallest in the array (b)
    }
}