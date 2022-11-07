public class Main {
    public static void main(String[] args) {
        Kutya k1 = new Kutya();
        k1.egyélCsirkeCombot();
        System.out.println(k1);

        Kutya k2 = new Kutya();
        //Kutya.Pont p1 = k2.new Pont(); //nem static belső class
        Kutya.KutyaBőr kb1 = new Kutya.KutyaBőr(); //static belső class

        Görbe g1 = new Görbe();
        Görbe.Pont p1 = new Görbe.Pont();
        p1.x = 0.0;
        p1.y = 0.0;
        g1.addFeszítőPont(p1);

        Görbe.Pont p2 = new Görbe.Pont();
        p2.x = 1.0;
        p2.y = 2.0;
        g1.addFeszítőPont(p2);
        System.out.println(g1);
        Macska m1 = new Macska();
        System.out.println(m1.getLábakSzáma());
    }
}

//public class kutya hiba: Class 'Kutya' is public, should be declared in a file named 'Kutya.java'
//public osztály csak a sajat fajljaban lehet
//ökölszabály: minden class-t sajat osztalyba
//egy fajlon belül csak egy public osztaly lehet es annak a nevének meg kell egyeznie a fajl nevének
/*
ha nem public akkor lehet több is
ha nem public csomaglathatosagi szint
class nem lehet se protected se static
belső osztalyok lehetnek
 */