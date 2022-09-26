public class Main {
    // clean code el: fentröl lefelé lehessen olvasni a kodot
    //a kodot, ne kellen fel-le ugralni a kodban
    //a megértéséhez
    //Praktikusa: főprogram, amit először hív
    //az jön utána, stb...

    //Mi a class?
    //Ez egy adatszerkezet
    //és mint minden adatszerkezetnél a következő
    //kérdéseket tesszük fel:
    //1. egyszerű v. összetett
    //a többi kérdés, csak akkor, ha összetett
    //2. folytonos v. szétszort a memóriába
    //3. homogén v. (inhomogén) heterogén
    //4. soros (szekvencialis) v. direkt (asszociativ) hozzáférésű

    // A tömb: összetett, folytonos, homogén, direkt
    // Egyirányba láncolt lista: összetett, szétszórt, homogén, soros
    // Rekord:
    //  a rekord mezőkből áll, a mezők bármilyen típusuak lehetnek
    //  mezőkhőz hozzáférné így kell:
    //  rekord_neve.mező_neve
    //  összetett, folytonos, inhomogén, direkt
    //egységbezárás (encapsualtion): az adatszerkezetet és az adatszerkezeten végrehajhato műveleteket
    //               egy egységbe(unit) zárom(enclose) és ezt osztálynak nevezem
    // Class (osztály):
    //  class = rekord + a rekordon végrehajhato műveletek
    //  az osztály mezőkből áll + metódusok
    //  a mezők az osztályon belül globális változók

    // Figyelem: globális változót használni veszélyes
    // Definicio (mellékhatás(korlátozott verzio)): Azt mondjuk, hogy egy alprogramnak mellékhatása van,
    //                                              akkor és csak akkor, ha megváltoztatja a környezetét
    //                                              azaz, globális változónak értéket ad

    //Figyelem a mellékhatás erősen kerülendő
    //mert nehezen megtalálható hibákhoz vezethet
    //A program 102. sorát megváltoztatom, ami hibát okoz a 5267. sorban
    //ennyi kodot nem latunk át
    //egy programozó egyszerre 100-500 sort lát át

    //a mező szuper dolog, mert olyan globalis valtozo
    //ami az osztályon belül lokális,
    //amig egy osztály kb. 100 soros, addig nem okoz gondot
    //de ha nagyon nagy osztályokat csinalok, gondot okoz
    //Ha nagy az osztályod akkor a megoldás,
    //SRP - single responsibility principle
    //Olvasd el a Tiszta kód könyvet

    public static void main(String[] args) {
        Kutya k1 = new Kutya("Bodri");
        Kutya k2 = new Kutya("Buksi");

        k1.etetés(10);
        System.out.println(k1.getJóllakottság()); //11
        System.out.println(k2.getJóllakottság()); //1

        k1.fut();
        k2.fut();

        System.out.println(k1); //él
        System.out.println(k2); //nem él

        //ha egy referenciát iratunk ki, mindig meghivodik a toString()

        //Object o = new Object();
        //o.
        if(k1 == k2) //a két referncia ugyanoda mutat?
            System.out.println("a két referencia ugyanoda mutat");
        if (k1.equals(k2)) {//a két kutya belső állapota ugyanaz?
            System.out.println("");
        }
        if (k2.equals(k1)){

        }
    }
    //belső állapot: a mezők pillanatnyi értéke
}
