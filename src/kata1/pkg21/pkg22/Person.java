package kata1.pkg21.pkg22;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public String getName() {
        return name;
    }
    int getAge(){
        LocalDate now = LocalDate.now();
        Period p = Period.between(birthdate, now);
        return p.getYears();
    } 
}