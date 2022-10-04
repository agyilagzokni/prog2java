public class Main {
    /*
    az interface ugyanugy a legmagabass szinten élő kulcsszó
    interface class enum record
    classnak ket tulajdonsaga van: felülete és megvalositasa, idegen szoval implementacioja
    interfacenek csak interface-e van, megvalositasa nincs
    mi a class interface-e:
        class interface-ébe beletartozik minden ami public
        az interface és a class között van egy atmenet az abstract class
        az abstract classnak van interface-e és van részleges megvalositasa
    interface kulcsszo szintaxisa:
    modositók interface név [implements [implementalt interfaceek]]{
        metodusfejek
    }
    minden metodus public és abstract
    nem kell kiirni se a public kulcsszot se az abstract kulcsszot
    remek jo példa az interface-re a List, leirja mit kell tudnia egy listanak:
    az interface nem azt mondja meg hogyan kell implementalni, az interface azt mondja meg mit kell tudni
    annak a classnak, aki őt implementalja
    class szintaxisa:
    modositók class név [extends ősosztály neve][implements implementalt interface-ek]{ egy osztalynak egy őse van, és több interface-t implementalhat

    }
    SOLID alapelvekből az I betű azt jelenti interface szegregacios alapelv
    hungarian notation (magyar névadási modszer)
    egy változo nevéből ki lehet találni a változo tipusat
    icount az egy olyan count aminek tipusa int
    interface tudUgatni{
        String ugat();
    }
    a kutya az egy object
    kétféle is-a kapcsolat van: öröklődés és az is-a kapcsolat
    is-a kapcsolat amivel tipust kapsz
    uml-ben az is-a
    interfacenek lehet sok ősinterface-e

    generikus adatszerkezetek
    nagyon jellenzoek a collection-re
    a collection helye a java.util csomagban van
    a java.util csomagban van olyan hogy collection<E>
    kacsacsőr generikus
    amelynek paramétere egy masik adatszerkezet
    általában egyparaméteres, de több is lehet
    legtipikusabb példája a List adatszerkezet, amit a List interface valosit meg
    az adatszerkezet muveleteit és azok szerzodéseit adja meg az interface
    egy metodus 3 reszbol all:
    szerzodésbol, fejbol és törzsből
    sajnos javaban szerzodest megadni nem kötelező
    contract
    előfeltétel: milyen belső állapot eseten milyen bemeneteket fogadok el

    generikus szintaxisa
    modosito class uj_generikus_adatszerk_neve [extends, implements] <tipusok>{
        adatszerk definicioja
    }
    a kacsacsor közt felsorolt neveket mint tipust hasznalhatom a törzsben
    a listanak muveletei fuggetlen attol hogy milyen tipust tartalmaz

    verem(stack(last in first out)) adatszerk muveletei függetlenek attol, hogy a sorban milyen tipusu elemek vannak
    sor(queue(first in first out)) adatszerk muveletei függetlenek attol, hogy a sorban milyen tipusu elemek vannak
    homogen adatszerkezetek
    ugyanolyan tipusuak, de mindegy milyen tipus

    verem metodusai:
        push, pop, top

    E[] myverem = new E[](100);
    amivel majd szimulalni fogom a
    az E betüt ugy hasznaltam mintha tipus lenne
    javaban int listat nem lehet csinalni
    wrapper(becsomagol) osztalyok
    minden alaptipus becsomagolo osztaly

    */
    public static void main(String[] args) {
        TudUgatni t1 = new Kutya();
        t1.Ugat();
    }
}
