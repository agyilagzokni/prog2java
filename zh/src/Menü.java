import java.util.Scanner;

public class Menü {
    Szőlőbirtok birtok = new Szőlőbirtok();
    public void kiválasztás(){
        Scanner reader = new Scanner(System.in);
        reader.useDelimiter("\n");
        System.out.println("Szőlőbirtok menü");
        System.out.println("1 - Parcella felvétele\n2 - Éves termés felvétele parcellához\n" +
                "3 - Parcella adatainak módosítása\n4 - Éves termés módosítása\n5 - Kilépés a programból");
        int menüPont = reader.nextInt();
        String helyrajziSzám = null;
        String szőlőfajta = null;
        int tőkeSzám = 0;
        int év = 0;
        Szőlőbirtok.Szőlőfajta fajta = null;
        switch(menüPont){
            case 1:
                System.out.println("A következő adatokat lesz szükség: Szőlőfajta, helyrajziSzám, tőkeSzám");
                System.out.println("Szőlőfajta (Leányka, Kékfrankos, Furmint): ");
                szőlőfajta = reader.next();
                System.out.println("Helyrajzi szám: ");
                helyrajziSzám = reader.next();
                System.out.println("tőkeSzám");
                tőkeSzám = reader.nextInt();
                fajta = Szőlőbirtok.Szőlőfajta.valueOf(szőlőfajta);
                birtok.parcellaFelvétele(fajta, helyrajziSzám, tőkeSzám);
                break;
            case 2:
                System.out.println("A következő adatokat lesz szükség: helyrajziSzám, év, évesTermés, tőkeSzám");
                System.out.println("helyrajziSzám: ");
                helyrajziSzám = reader.next();
                System.out.println("év: ");
                év = reader.nextInt();
                System.out.println("évesTermés: ");
                int évesTermés = reader.nextInt();
                System.out.println("tőkeSzám");
                tőkeSzám = reader.nextInt();
                birtok.évesTermésFelvételeParcellához(helyrajziSzám, év, évesTermés, tőkeSzám);
                break;
            case 3:
                System.out.println("A következő adatokat lesz szükség: helyrajziSzám, újHelyrajziSzám, Szőlőfajta, tőkeSzám");
                System.out.println("helyrajziSzám:");
                helyrajziSzám = reader.next();
                System.out.println("újHelyrajziSzám:");
                String újHelyrajziSzám = reader.next();
                System.out.println("Szőlőfajta (Leányka, Kékfrankos, Furmint): ");
                szőlőfajta = reader.next();
                System.out.println("tőkeSzám:");
                tőkeSzám = reader.nextInt();
                fajta = Szőlőbirtok.Szőlőfajta.valueOf(szőlőfajta);
                birtok.parcellaAdatainakMódosítása(helyrajziSzám, újHelyrajziSzám, fajta, tőkeSzám);
                break;
            case 4:
                System.out.println("A következő adatokat lesz szükség: helyrajziSzám, év, összesTermés, tőkeSzám");
                System.out.println("helyrajziSzám:");
                helyrajziSzám = reader.next();
                System.out.println("év:");
                év = reader.nextInt();
                System.out.println("összesTermés:");
                int összesTermés = reader.nextInt();
                System.out.println("tőkeSzám");
                tőkeSzám = reader.nextInt();
                birtok.évesTermésMódosítása(helyrajziSzám, év, összesTermés, tőkeSzám);
                break;
            case 5: System.exit(0);
        }
        this.kiválasztás();
    }
}
