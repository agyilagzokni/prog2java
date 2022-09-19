public class Main {
    public static void main(String[] args) {
        NegySzog n1 = new NegySzog(3.0, 2.0, 4.0, 3.0);
        NegySzog n2 = new NegySzog(4.0, 5.0);
        NegySzog n3 = new NegySzog(6.0);
        //nyomkövetés
        //f7 - step into: belelép a metodushivasba, átadja a vezerlest a 4paramos konstruktornak
        //f8 - step over: egy lépésben hajt vegre metodushivast
        NegySzog n4 = new Téglalap(3.0, 5.0);
        //többalakuság: az öröklődési lánc felfelé megkapok minden tipust
        //kérdés: mit kell a new utan irni?
        // A: metodushivast
        // B: egy típust
        // C: konstruktorhivast
        //megoldas: c
    }
}
