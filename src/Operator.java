/**
 * Examples for Java operators
 *
 * @author Karl Sirkas
 */
public class Operator {

    public static void main(String[] args) {
        int i = 0;

        //Unary operators
        //post-increment
        System.out.println(i);
        System.out.print(i++); // 0 (increment here but not used)
        i++; // i + i (increment value plus another increment)

        System.out.println(i);

        int y = 0;

        //post-decrement
        System.out.println(y--);
        System.out.println(y);

        int j = 10;

        // pre-decrement
        System.out.println(j);
        System.out.println(--j);

        // brackets are the highest priority
        int x = i + (-j); // x = i - j; 2 - 9
        System.out.println(x);

        //binary operators(operator with 2 variables)
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b;
        System.out.println(d);

        int z = i * a +(c / b) - (-j) % x;
        /*
        1. z = i * a +( c/b) + j % x;
         */

        System.out.println(c);

        int divide = 40 / 5; // Quotient value
        System.out.println(divide);

        int module = 40 % 5; // Reminder value
        System.out.println(module);

        // Comparison operators (==, !=. >, <)
        boolean result = divide == module; // 8 == 5
        System.out.println(result);

        boolean result2 = divide !=module; //8 != 5
        System.out.print(result2);

        //logical operators (&&, -) - and, or
        /*
          true and false = false
          false and true = false
          false and false = false
          true and true = true

         */

        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        boolean orCheck = (8 < 9) || (10 > 4);
        System.out.println(orCheck);

        /*
        true || true = false
        false || false = false
        true || false = true
        false || true = true
         */

      //Assignment operators
        x = x + y; //both are same
        x += y;

        x /= y;

        x *= y;

        //ternary operators (?, :)

        String ternary = (8 > 10) ? "cat" : "Dog";
        System.out.print(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        boolean checkNumber = 9 == 9.0; // int == float
        System.out.println(checkNumber);

        //mostly used operators in real world
        //++,--
        //+
        //==,!=
        //&&,||
        //?, :
    }

}
