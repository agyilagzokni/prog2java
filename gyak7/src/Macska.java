public class Macska {
    public class LábakSzáma{
        public int lábakSzáma = 4;
        //ha csak adatszerkezetnek hasznaljuk a belső osztalyt akkor érdemes statikussá tenni
        //még akkor is hogyha a belső osztaly műveletei a belső osztalyban vannak
        //ha a külső osztaly belső állapotához akarok hozzáférni, azaz nem csak adatszerkként akarom hasznalni
        //akkor nem szabad hasznalni a staticot mert nem férek hozzá a példány mezőhöz
    }
    LábakSzáma myLábakSzáma;
    public int getLábakSzáma(){
        return myLábakSzáma.lábakSzáma;
    }
    public void setMyLábakSzáma(int lsz){
        myLábakSzáma.lábakSzáma = lsz;
    }
}
