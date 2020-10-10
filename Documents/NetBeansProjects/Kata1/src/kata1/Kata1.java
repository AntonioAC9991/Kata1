package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    
    public static void main(String[] args) {
        Person per = new Person("Antonio Aguado", LocalDate.of(1970, Month.MARCH, 30));
        System.out.println(per.getName() + " " + per.getAge());

    }
    
}
