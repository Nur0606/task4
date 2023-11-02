import java.time.LocalDate;

public class Student {
   String name;
 LocalDate tuulgangot;
 String nomertel;
 String natsyonalnost;



     @Override
    public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", tuulgangot=" + tuulgangot +
                 ", nomertel='" + nomertel + '\'' +
                 ", natsyonalnost='" + natsyonalnost + '\'' +
                 '}';
     }
    public Student    (String name, LocalDate tuulgangot, String nomertel, String natsyonalnost) {
        this.name = name;
        this.tuulgangot = tuulgangot;
        this.nomertel = nomertel;
        this.natsyonalnost = natsyonalnost;
    }

    }



