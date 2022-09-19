/**
 * Statment examples
 *
 * @author Karl Sirkas
 */
public class Statment {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Karl";

        if (name == "Karl" || name != "Erik") {
            System.out.println("The name is correct");
        }

        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is simple program");

        /*
        if(shirt size == M && shirt color == black) {
         //buy the shirt
         }
         */

        /*
         if(shirt size == M && shirt color == black) {
         //buy the shirt
          } else {
          //buy the shirt from other shop
          }
         */

        if(i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.print("y is greater than i");
        }

        if(i > y) {
            System.out.println("i is greater than y");
        } else if (i < 9) {
            System.out.println("i is lesser");
        } else if (i < 9) {
            System.out.println("i is invalid");
        }

        /* SWITCH
        if we want to check one condition for multiple values.
         */
        int x = 5;
        int j = 7;
        int z = x + j; //11

        switch (z) {
            case 10:
                System.out.println("the value of z is 10");
            case 11:
                System.out.println("the value of z is 11");
                break;
            case 12:
                System.out.println("the value is 12");
            default:
                System.out.println("Default Block executed!");
        }

        String color = "red";

        switch(color) {
            case"Red":
                System.out.println("Im a Red");
            break;
            case "white":
                System.out.print("Im white");
                break;
    }

    //While (Entry-check loop)
    int  money = 0;

    while (money <= 5 && money != 4) {
        System.out.print("Doing job");
        money++; // money = money + 1
    }

    //Do-WHILE (exit-check loop!)

        do {
            System.out.print("money=" + money);
            money += 10; // money = money + 10
        } while(money < 100);



    }


    }