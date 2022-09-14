import java.nio.channels.CancelledKeyException;

/**
 * Examples of Primitive datatype
 *
 * @author Karl Sirkas
 */

public class DataType {
    int a=1;
    long longNumber =545456681351L;
    short shortNumber =-32000;
    float decimalNumber =2.45f;
    double doubleNumber =3.456d;

    //Character
    char alpha = 'F';

    //True/False
    boolean hadLunch = true; // had lunch?
    boolean isHoliday = false;

    /*Multi-Line
    comment
     */

    int i; // 0
    float x; // 0.00f
    char animal; //
    boolean isClassTomorrow; // false

    //Non-primitive data types
    String word = "I'm not a developer";

    Character random ='u';

    Integer number =5;

    Float numberSecond =2.45F;

    Integer randomNumber; // null

    //Scope of class variables
    private static String CAR = "Toyota";

    public static String FOOD = "Cake";

    public static void main(String[] args) {
        int k= 0;
        Integer y =null;

        System.out.println(k);
        System.out.println(y);

        String _color = "black";

        int $hexaNumber = 0x2A;

        Float exam12_mark = 100.10f;

        String classname ="sda";

        int a = 100;
        int b = 0;

        int c = a + b;

        System.out.println(CAR);
        System.out.println(FOOD);
    }


}

