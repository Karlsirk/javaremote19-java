import java.time.Year;

public class StatementExercises {
    public static void main(String[] args) {
        int i;
        // solution 1
        for(i=0; i<=20;i++)
        if (1 % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("this is odd number");
        }
    }

   //Leap year
    int year = 2022;

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ) ) {
        System.out.print(year + "is not a leap year");
    } else {
        System.out.print(year+ "is not a leap year");
    }

    }

