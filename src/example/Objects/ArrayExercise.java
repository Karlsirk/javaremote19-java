package example.Objects;

/**
 * To find all pairs of elements in an array that sums to a specified number
 * {(1,2), (3,4), (4,8)}
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] array ={1, 2, 7, 3, 10, 2, 9};
        int sum= 4;


    }

    public String findAllPairsOfSum(int[] inArray, int sum){
        String result = "";

        for(int i=0;i < inArray.length;i++){
            for(int j=0;j < inArray.length; j++){
                if(inArray[i]+ inArray[j] ==sum){
                  result += "(" + inArray[i] + "," +inArray[j]+")";
                }
            }
        }


        return result;
    }
}
