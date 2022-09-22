import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 * packageExample
 *
 * @author Karl Sirkas
 */
public class PackageExample {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate) ;

        LocalDateTime LocalDataTime = LocalDateTime.now();
        System.out.println(LocalDataTime);

        LocalDate myBirthday = LocalDate.of(1996,8,20);
        System.out.println(myBirthday);


    }
}
