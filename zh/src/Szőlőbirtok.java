import java.util.ArrayList;

public class Szőlőbirtok {
    enum Szőlőfajta{
        Leányka,
        Kékfrankos,
        Furmint

    }
    class ÉvesTermés{
        int év;
        double összesTermés;
        int tőkeSzám;
        double egyTőkéreJutóTermés;
        public ÉvesTermés(int év, double összesTermés, int tőkeSzám){
            this.év = év;
            this.összesTermés = összesTermés;
            this.tőkeSzám = tőkeSzám;
            this.egyTőkéreJutóTermés = this.összesTermés/this.tőkeSzám;
        }
    }
    class Parcella{
        Szőlőfajta szőlő;
        String helyrajziSzám;
        int aktuálisTőkeSzám;
        ArrayList<ÉvesTermés> termésLista;
        public Parcella(Szőlőfajta szőlőfajta, String helyrajziSzám, int aktuálisTőkeSzám){
            this.szőlő = szőlőfajta;
            this.helyrajziSzám = helyrajziSzám;
            this.aktuálisTőkeSzám = aktuálisTőkeSzám;
            this.termésLista = new ArrayList<>();
        }
    }
    private ArrayList<Parcella> parcellák = new ArrayList<>();
    public void parcellaFelvétele(Szőlőfajta szőlő, String helyrajziSzám, int tőkeSzám){
        parcellák.add(new Parcella(szőlő, helyrajziSzám, tőkeSzám));
    }
    public void évesTermésFelvételeParcellához(String helyrajziSzám, int év, double évesTermés, int tőkeSzám){
        for(Parcella p : parcellák){
            if(p.helyrajziSzám.equals(helyrajziSzám)){
                p.termésLista.add(new ÉvesTermés(év, évesTermés, tőkeSzám));
            }
        }
    }
    public void parcellaAdatainakMódosítása(String helyrajziSzám, String újHelyrajziSzám, Szőlőfajta szőlőfajta, int tőkeSzám){
        for(Parcella p : parcellák){
            if(p.helyrajziSzám.equals(helyrajziSzám)){
                p.szőlő = szőlőfajta;
                p.aktuálisTőkeSzám = tőkeSzám;
                p.helyrajziSzám = újHelyrajziSzám;
            }
        }
    }
    public void évesTermésMódosítása(String helyrajziSzám, int év, double összesTermés, int tőkeSzám){
        for(Parcella p : parcellák){
            for(ÉvesTermés t : p.termésLista){
                if(t.év == év && p.helyrajziSzám.equals(helyrajziSzám)){
                    t.összesTermés = összesTermés;
                    t.tőkeSzám = tőkeSzám;
                }
            }
        }
    }
}
