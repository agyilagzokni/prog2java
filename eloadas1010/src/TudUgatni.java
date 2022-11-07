public interface TudUgatni {
    public static final String hang = "vauvau";
    public default String ugat(){
        return TudUgatni.hang;
    }
/*
interfaceen belül mezok static metodusok osztalyszintuek
abstract osztaly es interface összehasonlitasa:


mind a kettő arra jo hogy megmondjam a felületet és a részleges megvalositast
1
osztalynal egyszeres öröklödés van, interfacenél barmennyi

abstract osztalyban lehet peldanyszintu mező
csak public static final mezo lehet
2.
(rohadek default kulcsszó miatt alig van különbség)
abstract osztalynak lehet konsturktora
interacenek szerencsére nem lehet
hiaba van az abstract osztalynak konstruktora peldanyositani nem lehet
csak arra hasznalhato, hogy a gyermek meg kell hivnia valamelyik ős konstruktorat
ha nem irok az első sorban konstruktorhivast, akkor az az ősnek hivja a 0 paraméteres konstruktorát

3. abstract osztalyban lehet nem public rész is (jellemzoen protected)

kérdés mi van akkor hogyha ugyanazt a metodust két interfaceből is öröklöm, és mind a kettőben default implementacioja van?
ilyenkor a super kulcsszot kell hasznalni interfaceneve.super.metodusneve()

példa: TudUgatni interface, amiben van ugat(), és van default implementacioja,
van egy masik interface, egy ÁltalánosKutya interface, amiben van ugat()
class Kutya implements TudUganti, ÁltalánosKutya
akkor muszaj overrideolni az ugat metodust, hogy eldöntsük melyik implementaciot adjuk meg
@Override
public String ugat(){
    return TudUgatni.super.ugat();
}
abbol a szempontbol kell megvizsgalni hogy design by contract (szerzodés alapu programozas)
a metodus nem csak fejbol és törzsből áll, a metodusnak van szerzodése is
1. öndokumentalo megjegyzés/**
2. assert az ugyanolyan statement mint az if vagy a while vagy a for
assert:
syntax: assert(logikai kifejezés)
assert(logikai kif., error);
kivétel és error között különbség:
kivételt el lehet kapni, errort nem lehet
error mindenképp eljut legfelső szintre, és visszajut a felhasznalohoz

assert: a programnak ezen a pontjan milyen feltételnek kell igaznak lennie
assert(számlaérték >= 0)
ha a feltétel igaz fut tovább,
ha viszont nem akkor errort dob
assertet arra alkalmazunk, hogy megfogalmazzuk a szerzodest
amit öndok. megjegyzésbe irsz nem kényszerit
assert dinamikus check, programfutas közben ellenőrzi hogy igaz e vagy sem
durva dolognak szamit, ezért ki is lehet kapcsolni
java -da, ilyenkor le se futnak az assertek
éppen emiatt szigoruan tilos, hogy az assertnek mellékhatása legyen, hiszen kikapcsolhato
az assert arra valo, hogy fejlesztesi időben biztosak legyünk a szerzodésünk betartásában, viszont
kitelepites utan mar nem szabad az asserteket futtatni, mert hibakat dobhat fel
defaultba olyan szabad irni, ami a szerzodéshez kapcsolodik




 */
}
