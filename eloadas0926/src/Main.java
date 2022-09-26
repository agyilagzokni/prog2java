public class Main {
    //oop 3 alapelv
    //egységbezárás

    //öröklödés: minden osztalynak van ose kiveve az objectet a gyermekosztaly az ösosztalybol megörököl mindent
    //megörökli a felületét megörökli a megvalositasat

    //többalakusag: az öröklödési lancon felfelé minden megkapunk egy objektum mindne ilyen tipuskent hasznalhato
    //amit szabadon felöldefinialhatunk
    //javaban minden metodus virtualis
    //azaz felüldefinialhato
    //late binding
    //az szamit hogy a referncia hova mutat nem az hogy a referenciat milyen tipuskent hasznalunk
    //Kutya k1 = new Vadászkutya();
    //ha a vadaszkutya közvetlen osztalya a kutyanak
    //polimorfizmus miatt a vadaszkutyat hasznalhatom kutyakent
    //a new Vadászkutya() visszaadja a referenciat amit megkap a k1
    //k1.ugat()
    //ha korai kötés lenne azaz az ugat metodus nem lenne virtualis akkor a kutya osztaly ugat metodusa futna le
    //de javaban minden metodus virtualis ezert az szamit hogy hova mutat a referencia
    //k1 = new Juhaszkutya()
    //k1 statikus tipusa: Kutya
    //k1 dinamikus tipusa: Juhászkutya
    //k1 = new Öleb()
    //k1 statikus tipusa: Kutya
    //k1 dinamikus tipusa: Öleb
    //k1.ugat()
    //kerdes melyik osztalybol fog lefutni az ugat
    //mindig a dinamikusbol fut le mert kesoi kotes van
    //korai kotes olcsobb
    //virtualis metodusokat felül lehet definialni az override kulcsszo segitsegevel
    //az overrride javaban nem kulcsszo hanem annotation(programozoi paradigma) azaz @ karakterrel kezdődik
    //@Override
    //utana jon a metodus feje amit overrideolunk
    public static void main(String[] args) {
        Kutya k1 = new Vadászkutya();
        System.out.println(k1.ugat()); //vauvauvau
        //megszegi az ocp alapelvet
        //egyike a SOLID alapelvnek
        //masodik alapelv
        //ne hasznald a kibaszott override kulcsszot mert kibaszottul veszelyes csak
        //absztrakt illetve és hook metodus felülirasara hasznalhato az override
        //a hook metodus olyan metodus aminek van törzse, de a törzse üres
        //vagy csak egy return van benne, tehat nem absztrakt
        //és a return egy semmitmondo értéket ad vissza
        //az override veszelyes mert az öröklödes a legerosebb kapcsolat
        //ami 2 osztaly között lehetseges
        //ami megkeseriti az eletunknket az az implementation dependency
        //implementacios fuggoség: azt jelenti hogy ha az egyik osztalyt megvaltoztatom és
        //vele egy implementacios fuggoségben van egy masik osztaly, akkor valoszinuleg
        //azt a masik osztalyt is meg kell valtoztatni
        //az öröklödest szoktak feher dobozos ujrahsznositasnak hivni
        //oop alapveto értelme az ujrahasznosithatosag
        //megirsz egy osztalyt aminek kicsit keves mellekhatasa van, levésbe fugg masoktol, akkor
        //azt az osztalyt felhasznalhatod mobilapplikacioban
        //az öröklődés white box reuse
        //white box akkor hogyha ismerjuk a forraskodot
        //white box ellentéte black box nem ismerjuk a forraskodot
        //black box testing azt jelenti hogy ismerem a specifikaciot, de nem ismerem a forraskodot
        //white box testing, ismerem a specifikaciot és a forraskodot is
        //white box reuse, ujrahsznositom a kodot ugy hogy ismerem a kodot
        //a programozo alapvetoen lusta
        //az a baj hogy altalaban ismerem az osnek a forraskodjat
        //rövid és gyorsan futo kodot szeretnék
        //attol a perctol hogy kihasznalom hogy van az ős implementalva, a két osztaly implementacios fuggoség van
        //GOF1:
        //Gang of Four (négyek bandaja)
        //a gof könyv alatt a programtervezési mintak cimu konyvet értjuk
        //a gof1 és gof2
        //gof1: programozz felületre megvalositas helyett, azaz programozz ugy mintha nem ismerned a forraskodot

        //az öröklödest megtilthatom a final kulcsszoval
        //final class Kutya{} akkora kutyanak nem lehetnek gyermekosztalyai
        //ha egy mezo neve elé irod hogy final akkor az a mezo konstans
        //a hackerélet megkevesitese miatt ha a Stringbol lehetne örökölni, akkor a sajat gyermek példányt atadhatnad
        //abstract class osztaly_neve{}
        //absztrakt osztalybol nem lehet peldanyositani, ettol fuggetlenul lehet konstruktora
        //lehet irni konstruktort, leszarmazottaknak jo lesz
        //meg lehet hivni super()
        //absztrakt osztalynak 3 tulajdonsaga van:
        //1. van felülete
        //2. és lehet megvalositasa
        //ismétlés: sima osztalynak 2 tulajdonsaga van
        //felülete és megvalositasa
        //absztraktnak nem muszaj hogy legyen megvalositasa
        //absztrakt osztalyban lehet absztrakt metodus
        //absztrakt metodus kulcsszava abstract
        //nincs törzse, törzse helyén ; áll
        //csak feje van
        //public abstract class Kutya{
        //      public abstract String ugat(){
                    //;
        //      }
        // }
        //a kutya felületében benne van az ugat
        //a viselkedés kidolgozasat rahagytam a gyermek osztalyra
        //a kutya tud ugatni, de nem mondtam meg hogy a kutya hogy ugat
        //a nem absztrakt gyermekosztalyoknak az ős minden absztrakt metodusat ki kell dolgozni
        //azaz a vadaszkutyanak meg kell mondani hogyan ugat
        //az ölebnek meg kell mondani hogy hogyan ugat
        //az @Override segitségével
        //a vadaszkutyanak ki kell dolgoznia az ugat metodust
        // a vadaszkutyanak meg kell adnia az ugat viselkedését
        //attol hogy vmi absztrakt nem azt jelenti hogy nincs szerződése
        //szerződés alapu programozas
        //design by contract
        //mindem metodusnak van elő és utófeltétele
        //az előfeltétel megmondja hogy milyen paramétereket vár
        //az utofeltétel megmondja hogy milyen vsszatérési értéket ad vissza
        //klasszikus példa: binaris keresés
        //lista amiben keresek, de a listanak rendezettnek kell lennie
        //utofeltétel: igaz ha benne van, hamis ha nincs
        //toString visszaadja a belső állapotot
        //1.
        //2. toStringbe felhasznalom az összes mezőt
        //3. toStringbe meghivom az ős toStringjet és hozzaadom a sajat nevem
        //öröklöm az equals-t
        //az equals 2 objektum osszehasonlitasara valo
        //akkor ad igazat ha a 2 obj belso allapota ugyanaz
        //egyebként hamisat ad
        //ha felülirod az equalsöt akkor ajanlott felülirni a hashCode() szinten öröklött metodust
        //ami az equals szerint egyenlő, annak a hashkódjanak is egyenlonek kell lennie
        //ugyanaz a szabaly az equalsre is meg a hashcodera:
        //fel kell hasznalni az összes mezot
        //megöröklöd a notify-t meg a wait-et is
        //öröklöd még a clone metodust
        //a clone metodus arra jo hogy létrehozza a klonodat,
        //aminek a belső állapota ugyanaz, de egy masik helyen van a memoriaban
        //vigyazat az equals objectet kap paraméterkent
        //illetve a clone objectet ad visszateresi tipuskent
        //
    }
}
