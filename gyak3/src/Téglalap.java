public class Téglalap extends NegySzog{
    //OPP 3 alapelve: öröklődés, egységbezárás, többalakusag
    //öröklődés kulcsszava: extends
    //szintaxis
    //class gyermekosztaly extends ősosztaly
    //a gyermek megörököl mindent az ősbol

    //implicit konstruktor:
    //az implicit (auto) konstruktor 0 paraméteres és meghivja az ős 0 paraméteres konstruktorat
    // A: nem irtuk meg az auto konstruktort
    // B: az ősben nincs 0 paraméteres
    // C: az ős minden mezője private
    //megoldas: b
    //implicit konsturktor csak akkor van ha nem irok sajat explicit konstruktort
    //azert kapunk hibat mert az osben nincs 0 paramos
    //ha nincs 0 paramos az osben akkor nem tudja meghivni, ezert kapok hibat

    //hogyan néz ki az explicit konstruktor
    public Téglalap(double a, double b){
        super(a, b); //az őst a super kulcsszóval kell hivni
        assert(a==getC() && b==getD());
        //'c' has private access in 'NegySzog'
    }
    public double getA(){
        return a;
    }
    //igy nez ki az implicit konstruktor megirva explicitben
}
