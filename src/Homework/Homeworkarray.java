package Homework;

public class Homeworkarray {

    public int findSecondLargestNumber(int[] inputArray) {

        int array[] = {1, 7, 3, 10, 9};
        int result = array[0];

        for (int x : array){
            if(x > result ){
                result= x - 1;
            }
        }
        System.out.println(result);

    { return result;

}
}
}
