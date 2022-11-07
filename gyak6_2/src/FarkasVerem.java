import java.util.Stack;

public class FarkasVerem {
    private class Farkas{
        public String név;
        public int lábakSzáma;
    } //belső osztalyt azért csinalom hogy legyen egy olyan adatszerkezet ami csak az enyém
    //belső osztalyt akkor hasznalok hogyha senkinek semmi köze egy összetett adatszerkezethez amit én belül hasznalok
    //ilyenkor szabad public mezoket csinalni
    //egyébként public mezot csinalni tilos, de classon belül miért nem
    //ilyenkor a class nem mint metodusgyujteményt hasznalom,
    //hanem ugy mint egy adatszerkezetet
    Stack<Farkas> verem = new Stack<>();

    public void push(String név, int lábakSzáma){
        Farkas f = new Farkas();
        f.név = név;
        f.lábakSzáma = lábakSzáma;
    }

    public int farkasokSzámaAVeremben(){
        return verem.size();
    }
    //házi: szamologép 4 alapmuvelet grafikus felület
}
