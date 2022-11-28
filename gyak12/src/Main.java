import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //FileBeolvasó fb = new FileBeolvasó();
        //fb.beolvas("C:\\Temp\\a.txt");
        //ValamiDátum d = new ValamiDátum();
        //System.out.println(d);
        //LocalTime v LocalDateTime
        //datum1.isAfter(datum2)
        LocalTime d1 = LocalTime.now();
        LocalTime d2 = LocalTime.parse("10:55:00");
        if (d1.isAfter(d2)){
            System.out.println("korabbi");
        }else{
            System.out.println("késöbbi");
        }
        Konténer k1 = new Konténer();
        k1.add("Gábor");
        k1.add("Kristóf");
        k1.add("Zsolt");
        for (String név : k1) {
            System.out.println(név);
        }
        Bárány b1 = new Bárány(1, 2, "xd");
        Bárány b2 = (Bárány)b1.clone();
        System.out.println(b2);
    }
    /*
    feladat: irjon osztalyt, ami felolvassa
    a C:\Temp\a.txt szöveges file tartalmát és
    kiirja a képernyore
     */
}
class FileBeolvasó{
        public void beolvas(String fájlnév){
            try{
                FileInputStream input = new FileInputStream(fájlnév);
                Scanner sc = new Scanner(input);
                while(sc.hasNext()){
                    String s = sc.nextLine();
                    System.out.println(s);
                }
                sc.close();
            }catch (Exception e){
                System.out.println("hiba");
                System.out.println(e);

            }
        }
    }
/*
épitsük meg ezt a stringet a mostani pontos időből
2022-11-28 11:22:05
itt egy nehezseg: "05"
trükk: LocalTime, vagy LocalDateTime
trükk: String.format("%02d %s %f",s)
 */
class ValamiDátum{
    @Override
    public String toString(){
        LocalDateTime t = LocalDateTime.now();
        /*
        String ki = "";
        ki += Integer.toString(t.getYear());
        ki += "-";
        ki += String.format("%02d", t.getMonthValue());
        ki += "-";
        ki += String.format("%02d", t.getDayOfMonth());
        ki += " ";
        ki += String.format("%02d", t.getHour());
        ki += ":";
        ki += String.format("%02d", t.getMinute());
        ki += ":";
        ki += String.format("%02d", t.getSecond());*/
        StringBuilder sb = new StringBuilder();
        sb.append(t.getYear())
        .append("-")
        .append(String.format("%02d", t.getMonthValue()))
        .append("-")
        .append(String.format("%02d", t.getDayOfMonth()))
        .append("-")
        .append(" ")
        .append(String.format("%02d", t.getHour()))
        .append(":")
        .append(String.format("%02d", t.getMinute()))
        .append(":")
        .append(String.format("%02d", t.getSecond()));
        return sb.toString();
    }
}
//rohadek iterable interfsz hasznalata
//minden ami collection az megvalositha az iterable interfacet
//és minden ami megvalositja ezt, az hasznalhato
//foreachben
//kontener osztaly: elrejt egy vagy több listat vagy halmazt

class Konténer implements Iterable<String>{
    List<String> nevek = new ArrayList<>();

    public void add(String s){
        nevek.add(s);
    }

    @Override
    public Iterator<String> iterator() {
        return nevek.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}

/*
részfeladat:
klonozzunk Bárányt
nagyon praktikusan:
van egy konstruktor, ami beallitja az összes mezöt
a clone metodus ennek az eredmenyek adja vissza
ugy hogy ugyanolyan Bárány legyen
 */
class Bárány implements Cloneable{
    int x, y;
    String név;
    public Bárány(int x, int y, String név){
        this.x = x;
        this.y = y;
        this.név = név;
    }

    @Override
    public Object clone(){ //a klónom és én függetlenek vagyunk, ha a klon megvaltozik, én nem változok meg
        return new Bárány(this.x, this.y, this.név);
    }
    @Override
    public String toString(){
        return "x: " + this.x + " y: " + this.y + " név: "+this.név;
    }
}