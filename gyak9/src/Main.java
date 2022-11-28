import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    //Milyen tipusu a fogyasztas -> double
    //milyen tipus a datum -> Calendar
    //kérdés: hogy kell összehasonlitani két datumot
    // --> Konténerosztályt kell csinalni
    // ---> Hashmap / Hashtable / vagy két lista (egyik datum vagy fogyasztas)

    public static void main(String[] args) {
        GázFogyasztás teszt = new GázFogyasztás();
        teszt.add(new GregorianCalendar(2022, 10, 7), 40);
        teszt.add(new GregorianCalendar(2022, 10, 1), 30);
        teszt.add(new GregorianCalendar(2021, 10, 1), 10);
        System.out.println(teszt.évÁtlaga(2021));
        KönyvesPolc polc = new KönyvesPolc();
        KönyvesPolc.Könyv k1 = new KönyvesPolc.Könyv("asd", new String[] {"a", "b"}, 2010);
        polc.addKönyv(k1);
    }
}
