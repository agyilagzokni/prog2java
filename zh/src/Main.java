public class Main {
    /* Feladat: szölöbirtok kezelese
    egy szolobirtok több parcellabol áll
    egy parcellan belül csak egy fajta szolo van, ami lehet
    Leányka, Kékfrankos, Furmint
    a parcellanak van helyrajzi szama is (string), illetve
    tudjuk hány tőke van a parcellán
    a parcellan evenkenti termés van, amikbol ezeket tároljuk:
    év, össz termés (double), egy tőkére jutó átlagos termés (szamitott adat).
    1. alfeladat: parcella felvétele
    2. alfeladat: éves termés felvétele parcellahoz
    3. alfeladat: parcella adatainak modositasa helyrajzi szám alapján
    4. alfeladat: éves termés adatainak módosítása helyrajzi szám és év megadásával választjuk ki a modositani kivant részt
    5. alfeladat: fenti pontokat összefogó menürendszer kialakitasa
     */
    public static void main(String[] args) {
        Szőlőbirtok birtok = new Szőlőbirtok();
        Menü menü = new Menü();
        menü.birtok = birtok;
        menü.kiválasztás();
    }
}
