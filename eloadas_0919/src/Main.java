public class Main {
    public static void main(String[] args) {
        Gerinces g1 = new Gerinces(5.2); //javaban ertek szerinti értékátadás van
        Kutya k1 = new Kutya("Buksi"); //melyik konstruktor hivodik meg? Kutya 1 paramos
        //tehat k1 belső állapota az hogy: a neve Buksi, sulya 1.8
        Object o1 = k1;
        k1 = k1.setNév("Cézár");
        System.out.println(k1.getNév());
    }
}
//inheritance
//encapsulation
//polymorphism

//belső allapot: a mezok pillanatnyi értéke

//mai ora temaja:
//minden mezohoz altalaban csinalok settert és gettert
//ha a mezo neve az hogy név, akkor a setter neve az hogy setNév
//a getter neve az hogy getNév
//ha a mezonek az a neve hogy suly, akkor a setter neve az hogy setSúly
//a getter neve az hogy getSúly
//a getter tipusa megegyezik a mezo tipusaval és 0 parameteres
//a setter 1 paraméteres


//uj anyagrész: new
//new az egy kulcsszo angolul keyword
//megszoritas: név vagy identifier barmi lehet ami betuvel alahuzasjellel kezdodik,
//betuvel alahuzasjellel, szammal folytatodik kiveve a kulcsszavakat
//int new nem jo mert a new az egy kulcsszo
//a new 3 dolgot csinal:
//1.:memoriat foglal a dinamikus memoriaba, annyi memoriat foglal, ami egy ilyen példanynak megfelel
//pl. new Kutya, akkor egy Kutyanyi memoriat foglal a dinamikus memoriaba
//a new lefoglal, de nincs parja ami felszabadija
//a dinamikus memoriat a szemetgyujto szabaditja fel, Garbage Collector
//el lehet rontani a memoriafelszabaditast, ha elrontod nagyon cifra hibak lehetnek belole
//memory leak, memoria szivargas, szép lassan fogy a memoria
//2.:konstruktor beallitja a mezoket
//3.:visszaadja a referenciat a lefoglalt memoriateruletre

//amit kicsavartak a kezunkbol:
// pointeraritmetika: mert konnyu elrontani

//minden tipus vagy referenciatipus vagy értéktipus
//minden osztaly referenciatipus
//refernciatipus alapértelmezett értéke null
//null: sehova se mutat
