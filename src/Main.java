import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("NURTILEK", LocalDate.of(2006,11,22) ,"220180752","KYRGYZ");
        Student student1 = new Student("NURTILEK1", LocalDate.of(2005,11,22) ,"220180752345","rusiya");
        Student student2 = new Student("NURTILEK2", LocalDate.of(2004,11,22) ,"22018075225","avgan");
        Student student3= new Student("NURTILEK3", LocalDate.of(2007,11,22) ,"22018075273","tojik");
        Student student4 = new Student("NURTILEK4", LocalDate.of(2023,11,22) ,"22018075265","sart");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

    }


}
