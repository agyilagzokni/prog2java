public class Negyzet extends NegySzog{
    public Negyzet(double a){
        //konstruktorbol konstruktorhivas helye a konstruktor legelso sor
        //ha nem irsz semmit akkor olyan mintha azt irtad volna hogy: super()
        //azaz hivod az ős 0 paraméteres konstruktorat
        //mivel nincs az ősben 0 paraméteres konstruktor ezert hibauzenet
        //megoldas1: az ősbe irok 0 paraméterest
        //megoldas2: meghivom azt ami azt csinalja amit kell
        super(a);

        //hiba: Call to super() must be first statement in constructor body
        //konstruktorbol konstruktort hivni csak a konstruktor első soraban lehet
        //hiba: there is no default constructor available in NegySzog

        //assert jelentése
        //hasznalata: assert(logikai kifejezes)
        //feltételezem hogy a program futasanak ezen a pontjan ez a feltétel igaz
        //dinamikus ellenőrzés (futas közben ellenőrzöm, hogy amiről azt gondolom hogy igaz az tenyleg igaz futas közben
        //1. azert nem szeretik mert időt visz el
        //2. assert ki be kapcsolhato és sose vilagos hogy ki van e kapcsolva vagy be van e
        //3. az összes vezető programozo azt gondolja hogy nem assertet kell hasznalni hanem logolast
        //4. amikor ők születtek akkor még nem volt
        //5. assert helyett inkabb elterjettebb a sonarqube, csak ezek statikusan csinaljak
        //6. ugy gondoljak hogy ha assertet hasznalsz beismered hogy vmi rossz lehet
        assert(a==b && a==c && a==d);
    }
}
