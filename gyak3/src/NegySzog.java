public class NegySzog {
    private double a, b, c, d; //mezők
    //private: csak én latom
    //protected: csak en és a gyermekeim

    /*
    public NegySzog(){
        //sírunk, mert a konstruktor feladata, hogy az összes mezőnek kezdőértéket adjon
    }
    */

    public NegySzog(double a, double b,
                    double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    //hanyas sorban kezdodik a konstruktor? 4
    //nincs visszateresi tipusa
    //konsturktor neve megegyezik az osztaly nevevel
    //téglalap konstruktor csak az a-t és a b-t kapja
    //2 paraméteresbol hivjuk a 4 paraméterest
    public NegySzog(double a, double b){
        this(a, b, a, b); //igy kell konstruktorbol konstruktort hivni
        //tehat ennek a kulcsszava: this
    }
    //csinaljunk negyzetet: a, a, a, a
    //1 paramosbol hivom a 4 paramosat
    public NegySzog(double a){
        this(a, a, a, a);
    }
//2 oldalas esszé konstruktor hiba
}
