import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kutya k1 = new Kutya("Buksi");
        Kutya k2 = new Kutya("Cézár");

        System.out.println(k1.size()); //0
        k1.add(k2);
        k1.remove(k2);
        /*
        List<Kutya> kölykök = k1.getKölykök();
        Kutya k2 = new Kutya("Cézár");
        kölykök.add(k2);
*/
        System.out.println(k1.size()); //1 //a size() metodus nincs kivezetve a konténer osztalyom interface-ére
        //baj a kutyaval: a kölykök listaja private, de a főprogram adott hozzá kölykök
        //egy sajat mezomet kivulrol modositottam, a foprogram hozzáadott egy kölykök és nem a Kutya class
        //egységbezárás alapelve lett megsértve: a sajat mezoimet csak en valtoztathatom meg
    }
}
