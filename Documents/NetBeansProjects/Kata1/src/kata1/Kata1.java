package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    
    public static void main(String[] args) {
        Person person = new Person("Luis Hernandez", LocalDate.of(1999, Month.MARCH, 30));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
