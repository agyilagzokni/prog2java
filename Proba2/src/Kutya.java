//minden ami class az referencia típus
public class Kutya {
    //ezek a mezok
    //a mezők együtt adják az adatszerkezetet
    private String név;
    // minden ref tipusnak az alapértelmezett értéke null
    //a null az a referencia, ami sehova se mutat
    private int lábakSzáma = 4; // értéktípus, az int alapértelmezett értéke a 0

    private double súly;
    private boolean fiú; // a boolean getterét isX-nek hivjuk

    // minden ami ref tipusu, az nagybetuvel kezdodik
    // minden ami érték (value) típusu, az kisbetuvel kezdodik
    //

    //metódusok = függvény
    //metodus 2 részből áll: a fej, törzs
    //fej: modosito visszatérési_típus név (formális paraméterlista)
    public void setNév(String újNév) //fej, szignativa
    //public: láthatósági szint
    //void: visszatérési típus (nem ad vissza semmit se)
    //a voidos fuggvenyeket hivjuk eljarasnak/procedure
    //setNév: név
    //függvénynek nincs kulcsszava
    //String újNév: formalis paraméterlista
    //törzs kezdete
    {
        //a Stringet hasznalhatom char tombként
        //a String első betuje a 0. indexen van
        if (Character.isLowerCase(újNév.charAt(0))){
            String újNév2 = Character.toUpperCase(újNév.charAt(0)) + újNév.substring(1);
            név = újNév2;
        }
        else{név = újNév;}
    }
    //törzs vége

    public String getNév(){
        return név;
    }

    //mivel két mezöm van, és minden mezőre illik setter-t és getter-t irni, ezért kell egy
    //setLábakSzáma
    //és ezt getLábakSzáma
    //minden metodus nevét kisbetuvel kell kezdeni
    public void setLábakSzáma(int újLábakSzáma){
        lábakSzáma = újLábakSzáma;
    }
    public int getLábakSzáma(){
        return lábakSzáma;
    }

    public void setSúly(double újSúly){
        súly = újSúly;
    }
    public double getSúly(){
        return súly;
    }

    public boolean isFiú() {
        return fiú;
    }

    public void setFiú(boolean fiú) {
        this.fiú = fiú;
    }
    //a this kulcsszo első felhasználása:
    //a this az a referencia az a referencia, ami az éppen aktualis példanyra mutat
    //azért kell kiirni mert a mezot is fiunak hivjak, és a paramétert is fiunak hivjak
    //munkahatáskörben a mezők hatóköre az egész osztaly, barhol ha leirod a mezo nevét az osztalyon belul,
    //akkor az azt a mezok fogja a jelenteni, kiveve ha lyuk van a hataskorben, akkor vna lyuk
    //ha egy lokalis valtozot ugyanugy hivnak mint egy globalis valtozot
}
