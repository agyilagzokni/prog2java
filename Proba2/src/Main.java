public class Main {
    public static void main(String[] args) {
        //A kutya az egy osztaly
        //az osztalynak lehetnek peldanyai
        //a k1 az egy Kutya példány
        //azaz a k1 tipusa: Kutya
        //példaynt ugy hozok letre hogy
        //Típus példányNeve = new kulcsszó konstruktorhívás
        Kutya k1; //a k1nek az értéke az egy memoriacim, ami specialisan lehet null, ami azt jelenti hogy sehol se
        k1 = new Kutya(); // a new helyet foglal a dinamikus memoriaba, meghivja a konstruktort, hogy az beallitsa a kezdoértéket és visszaadja a referenciat (mutató, pointer) erre a memoriahelyre
        //létrejött egy uj Kutya példány a dinamikus memoriaban
        //aminek a referenciajat megkapja a k1
        //azaz 3 dolgot csinal a new:
        // - helyet foglal a dinamikus memoriaba
        // - meghivja a konstruktort, hogy ezen a memoriahelyet allitsa be a kezdőerteket
        // - visszaadja a referenciat
        //a pointer és a referencia nem ugyanazt jelenti, a pointer értéke megvaltoztathato, a referencia és a pointer is egy cim a memorian belul
        //viszont a pointer értékét meg lehet valtoztatni, a referencia értékét nem lehet megvaltoztatni
        //a referencia egy olyan pointer, aminek az értékét nem lehet megvaltoztatni
        //amit a new lefoglal azt nem kell kezzel felszabaditani, hanem azt
        // un. GC (Garbage Collector) szemétgyujtő szabaditja fel *automatikusan*
        //azaz a programozo kezebol kicsavartak mégegy dolgot a dinamikus memoriafelszabaditasat
        //ez az mert rossz mert javaban !nem lehet! real time rendszert irni, a paksi atomeromuben nem futhat java
        //megjosolhatatlan, hogy a GC mikor fog lefutni,

        //Kutya : típus
        //k1 : példányNeve
        //new : new kulcsszó
        //Kutya() : konstruktorhívás
        //kérdés: hol van a konstruktor kodja
        //hat ez az explicit konsturktor ezt nem mi irtuk meg
        //ezt ingyen kapjuk
        //az automatikus vagy masnéven explicit konstruktor annyit csinal, hogy meghivja az ős nulla paraméteres konstruktorát,
        //ha nincs ?? hiba üzenet, szintaktikai hiba

        //létrejött a példány a mezői alapértelmezett értéket kapnak
        //a String nullértéket kap
        //az int 0 értéket
        k1.setNév("buksi");
        System.out.println(k1.getNév());
        //az egységbezárás miatt nem lehet közvetlen mezőt modositani
    }
}
