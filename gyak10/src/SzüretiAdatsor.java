import java.util.ArrayList;
import java.util.HashMap;

enum Minőség {
    ROSSZ,
    JÓ,
    NAGYONJÓ,
    KIVÁLÓ
}

public class SzüretiAdatsor {

    class Szüret {
        String gpsKoordináda;
        double mennyiség;
        Minőség minőség;
    }

    private ArrayList<Szüret> adatsor = new ArrayList<>();

    public void add(String gps, double mennyiség, Minőség minőség){
        Szüret sz = new Szüret();
        sz.gpsKoordináda = gps;
        sz.minőség = minőség;
        sz.mennyiség = mennyiség;
        adatsor.add(sz);
    }
    public double termésÁtlag(){
        double sum = 0;
        for(Szüret sz : adatsor){
            sum += sz.mennyiség;
        }
        return sum/adatsor.size();
    }
    public String legjobbTermőhely(){
        double maxValue = 0;
        Szüret legjobb = new Szüret();
        for(Szüret sz : adatsor){
            if(maxValue < sz.mennyiség && (sz.minőség == Minőség.NAGYONJÓ || sz.minőség == Minőség.KIVÁLÓ)){
                maxValue = sz.mennyiség;
                legjobb = sz;
            }
        }
        return legjobb.gpsKoordináda;
    }
}
