public class Main {
    public static void main(String[] args) {
        HallgatóiCsoport csoport = new HallgatóiCsoport();
        csoport.csoportBővítése("b b", "pti", "bbbbbb");
        Menü menü = new Menü("asd");
        menü.csoport = csoport;
        menü.kiválasztás();
    }
}
