import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ez egy konténer osztály
 * A konténer osztály alatt azt értjuk, hogy
 * van egy listam, vagy egy tömböm
 * es ehhez kapcsolodo muveleteket valositom meg
 */
public class Kutya {
    //List<Kutya> kölykök = new List<>();
    //hiba: 'List' is abstract; cannot be instantiated
    //a List absztrakt, nem lehet példanyositani
    private String név;
    private Set<Kutya> kölykök = new HashSet<>();
    //törekedni kell arra, hogy a legszegenyebb interfacet hasznaljuk
    //sajnos a Collection nem jo, mert nincs benne 2 metodus ami nekunk kell
    //javaban az öndokumental megjegyzes az a /**
    //az öndokumentalo megjegyzes html alaku programozoi dokumentaciot general

    public Kutya(String név){
        this.név = név;
    }

    //lyuk:
    //public List<Kutya> getKölykök(){return kölykök;} //ha van egy olyan meződ ami referencia tipusu, azt nem
    //nem szabad visszaadva, kivéve ha immutable, mert kivulrol megváltoztathatja,
    //mivel a list nem immutable, nem szabad visszaadni ra a referenciat
    //megoldás: az lista elemeit adom vissza és nem a listat
    //azokat a metodusokat kivezetem a sajat interface-emre amikre szükség van

    //üzleti logika, egy kutyanak max. 19 kölyke lehet
    //miért pont 19
    //a 19 egy magic number
    //


    //Ez a szerzodés:
    //leirom, hogy milyen bemenetre mit csinal a metodus
    /**
     * Hozzáad egy új kölykök a kutya példányhoz
     * az új kölyök nem lehet null
     * Egy kutyanak maximum 19 kölyke lehet,
     * ha már 19 akkor az új kölyök hozzáadása sikertelen
     * @param újKölyök a kölyökre mutato ref, nem lehet null
     * @return Visszaadja, hogy sikerult-e hozzáadni az új kölyköt
     * Sikertelen a hozzáadás ha a kölyök null, vagy már 19 kölyke van
     */
    public boolean add(Kutya újKölyök){ //kivezettem az add metodust a sajat interface-emre, innentol fogva nem kell visszaadni a referenciat
        if (újKölyök == null) return false;
        if (kölykök.size() == 19) return false;
        kölykök.add(újKölyök);
        return true;
    }//ebben nincs null check tehat nem bolondbiztos(bolondbiztos = felkészülök a rossz paraméterekre)
    //az egységbezárás azért nagyon jo dolog mert az üzleti logikat elég egyszer leirnom
    //nem kell mindenhol figyelnem arra, ahol hasznalom a listat, hogy betartják e az üzleti logikat
    //az üzleti logikat egy helyen irom meg, és azt ott kikényszeritem
    //szoba jön az hgy bolondbiztos dolgot csinalok e

    //az egyes collectionök abban különböznek, hogy az egyes metodusok milyen gyorsak
    //mindegyik tudja a contains metodust, csak nem mindegy hogy egy linearis idoben tudja, vagy amortizalt linearis időben vagy konstant időben tudja lefuttatni
    //keressünk egy olyan collections, ami konstant idő alatt fut le


    /**
     * amikor eladom az összes kölyköt, akkor a belső lista üressé válik
     *
     */
    public void összesKölyökEladása(){
        kölykök.clear(); //
    }
    /*
    public Kutya get(int index){
        return kölykök.get(index);
    }
*/
    public int size(){
        return kölykök.size();
    }
/*
    public Kutya remove(int index){
        return kölykök.remove(index); //kivezettem a remove() metodust a konténer osztalyom interface-ére
    }
*/
    public boolean remove(Object o){
        return kölykök.remove(o);
    }

}

//mi értelme a treesetnek ha logn a contains