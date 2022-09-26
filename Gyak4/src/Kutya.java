public class Kutya {

    //a mező hatóköre az egész osztály
    private int jóllakottság;
    private String név;

    // ez egy metodus, azaz alprogram
    //kérdés: van e mellékhatása
    //van, mert egy mezőnek értéket ad

    public Kutya(String név){
        //lyuk a hatókörben: ha a lokális változó (beleélrtve a pramétert
        //neve ugyanza mint a mezőé,
        //akkor a mező neve elé muszaj kiirni a this-t
        this.jóllakottság = 1; //szupergyanus szám
        this.név = név; // mező = paraméter
    }

    //toString-et örököljük az Objectből
    //felüldefiniálhatom, ehhez angolul kell kiirni
    @Override
    public String toString(){
        //fel kell hasznáálni az összes mezöt
        return "név: " + this.név + ", jóllakottság: " + this.jóllakottság + (élE() ? "" : " RIP");
    }
    @Override
    public boolean equals(Object obj){
        //összehasonlit két kutyát,
        //akkor ad vissza igazat, ha a két kutya egyenlő
        //két kutya egyenlő, ha a belső állapotuk ugyanaz
        //az == és az equals nem ugyanazt jelenti
        //sajnos castolni kell
        //szintaxis (kényszeritett_típus)kifejezes
        //equals mindig illik tenni egy null checket
        //amit paramternek kaptam az null-e
        //ha igen akkor nyilvan nem egyenlo vele
        if(obj == null) return false;
        //illik beletenni egy instanceof-ot is
        if (!(obj instanceof Kutya)) return false;
        Kutya másik = (Kutya)obj;
        //minden mező értéke ugyanaz e
        return this.jóllakottság == másik.jóllakottság &&
                this.név.equals(másik.név);
    }

    //this jelentése: az a példány, ami éppen fut (fontos)


    //van mellékhatása?
    //van
    public void fut(){
        this.jóllakottság -= 5;
    }
    public void etetés(int kajaMennyiség){
        //döglött kutyát nem lehet etetni
        //if (this.jóllakottság <= 0) return; //kérdéses, mert nem elég DRY
        if(!élE()) return; //igy mar elég DRY
        this.jóllakottság += kajaMennyiség;
        //a max jóllakottsági szint 100
        if (this.jóllakottság > 100) this.jóllakottság = 100;
    }

    public boolean élE(){
        // ?: operátor
        // ez egy 3 operandusu op
        // szintaxisa:
        // (logikai kifejezés) ? (kif_ha_igaz) : (kif_ha_hamis)
        return this.jóllakottság > 0;
    }

    public int getJóllakottság() {
        return this.jóllakottság;
    }
    //mivel férek hozzá a belső állapothoz
    //kérdés: A Kutya osztályon belül mivel férek hozzá a belső állapotokhoz?
    //this-en keresztul férek hozzá a mezőimhez
}
