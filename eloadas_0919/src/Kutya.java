public class Kutya extends Gerinces{
    private String név;
    //hany mezoje van a kutyanak: 2
    //konstruktor feladata hogy beallitsa az osszes mezot
    public Kutya(String név, double suly){
        super(suly);
        this.név = név;
    }
    public Kutya(String név){
        this(név, 1.8);
    }
    public Kutya setNév(String név){ //innentol fogva ez a Kutya nem immutable
        // immutable: a példany belső állapota megvaltozhatatlan
        return new Kutya(név, this.suly); //egységbezaras miatt védenem kell a belső állapotot
        //ezért kell minden mezőt private-tá vagy protected-é tenni
        //mert a mezok alapértelmezett lathatosagi szintje csomag láthatosági szint
        //egy package-en belül lathato
    }

    public String getNév() {
        return név;
    }
    //hogyan maradjon immutable a class de mégis meg lehessen valtoztatni:
    //nem megvaltoztatom hanem uj példanyt hozok létre
    //visszaadom amit szeretnél, de nem én változok meg

    //kérdés: mi az a kulcsszo amivel uj példanyt hozok letre: new
    //a new kulcsszoval hozok létre példányt
    //szintaxisa: new konstruktorhivas

    //konstruktor feladata beallitani a kezdo allapotpot ugy hogy beallitja a mezőket
    //konstruktorhivast 2 helyre szabad irni
    //new kulcsszo utan szabad irni konstruktorhivast
    //és konstruktor első soraba szabad konstruktorhivast irni
    //ami vagy this vagy super
    //this = sajat konstruktor
    //super = ős konstruktora
}
