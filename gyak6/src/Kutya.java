public class Kutya implements TudUgatni, ÁltalánosKutya{
    //Class 'Kutya' must either be declared abstract or implement abstract method 'ugat()' in 'TudUgatni'

    //a két interfaceben az ugat() az default: Kutya inherits unrelated defaults for ugat() from types TudUgatni and ÁltalánosKutya
    //ilyenkor muszaj overrideolni
    static int kutyaCounter = 0;
    final int lábakSzáma;
    public Kutya(){
        Kutya.kutyaCounter++;
        lábakSzáma = 4;
    }
    /*
    @Override
    public String ugat(){ //ha nincs kiirva hogy public: 'ugat()' in 'Kutya' clashes with 'ugat()' in 'TudUgatni'; attempting to assign weaker access privileges ('package-private'); was 'public'
        return ugatásHangja; //a példányszinről látom az osztályszintet, de forditva nem
    }*/
    /*@Override
    public String ugat(){
        return TudUgatni.super.ugat(); //super nélkül azért nem mukodik mert peldanyszintu
    }*/
    /*
    super hasznalatai:
     - konsturktorban: super(paraméterlista); ősosztály konstruktorának hivása
     - hivatkozhatok a supernek bármelyik példányszintű tagjára ugy hogy: super.tagnév
     - amikor tisztaba teszem, hogy melyiket akarom hasznalni a defaultok közül
     */
    @Override
    public String ugat(){
        return "vauvau";
    }
    public static int getKutyákSzáma(){
        //System.out.println(lábakSzáma);
        return kutyaCounter;
    }
    /*
    static metodusbol: Non-static field 'lábakSzáma' cannot be referenced from a static context
    osztályszintű (statikus) .. nem lathato a példányszintű
     */
    /*
    osztalynak két tulajdonsaga van:
     - felülete
     - implementacioja
     */
    /*
    példánynak harom tulajdosnaga van:
     - tipusai
     - viselkedése
     - belső állapota
     */
    /*
    osztalynak két féle interface-e van:
     - statikus (osztályszintű)
     - nem-statikus (példányszintű)
     */

    /*
    hasonlosag interface és abstract osztaly között
    mind a kettővel felületet definialok és mind a kettőnek lehet részleges implementacio
    interfaceen belül az implementacio megadásához a default kulcsszot lehet hasznalni
    interfacenek nem lehet konsturktora,
    abstract osztalyon belül lehet konstruktort csinalni
    az abstract osztaly konstruktora csak a gyermek konstruktorábol lehet hivni

    absract osztalyban lehet peldanyszintu mezo, viszont
    interfaceben nem lehet peldanyszintu mezo, mert interfaceben minden mező public static final
    interfaceen belül csak konstans lehet

    interfaceből akárhányat lehet ugymond "örökölni"
    osztalybol csak egyet

    az interfacet azért találták hogy helyettesitse a többszörös öröklödést
    */
    /*
    amit szét lehet választani azt érdemes széválasztani (separation of concerns)
    ellentéte az egységbezárás
    ISP: interface segregation principle
    az interfaceekben 1-2-3 visitva 4 metodus fér bele

    házi: találni kell 1 interface a java apiban ami ures
    1 oldalas esszé hogy miért van értelme

    arra kell törekedni, hogy az interfaceek legyenek vékonyak
    1 dologra vigyazni kell, ha több interfacebol is öröklöd ugyanazt a metodust
    akkor különbséget kell tudnom tenni, hogy melyiket melyikbol orokoltem
     */
}
