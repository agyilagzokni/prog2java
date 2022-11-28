import java.util.ArrayList;
import java.util.Date;

public class HasználtAutóLerakat {
    static class Auto{
        String gyártó;
        String típus;
        Date gyártásDátuma;
        int alvázszám;
        int irányár;
        public Auto(String gyártó, String típus, Date gyártásDátuma, int alvázszám, int irányár){
            this.gyártó = gyártó;
            this.típus = típus;
            this.gyártásDátuma = gyártásDátuma;
            this.alvázszám = alvázszám;
            this.irányár = irányár;
        }
    }
    private ArrayList<Auto> lerakat = new ArrayList<>();

    public void add(Auto a){
        lerakat.add(a);
    }
    public ArrayList<Auto> Keres(int maxÁr){
        ArrayList<Auto> uj = new ArrayList<>();
        for(Auto a : lerakat){
            if(a.irányár < maxÁr){
                uj.add(a);
            }
        }
        return uj;
    }
    public ArrayList<Auto> Keres(int minÁr, int maxÁr){
        ArrayList<Auto> uj = new ArrayList<>();
        for(Auto a : lerakat){
            if(a.irányár < maxÁr && a.irányár > minÁr){
                uj.add(a);
            }
        }
        return uj;
    }
    public ArrayList<Auto> Keres(Date nemRégebbiMintDátum){
        ArrayList<Auto> uj = new ArrayList<>();
        for(Auto a : lerakat){
            if(nemRégebbiMintDátum.compareTo(a.gyártásDátuma) >= 0){
                uj.add(a);
            }
        }
        return uj;
    }
    public ArrayList<Auto> Keres(Date nemRégebbiMintDátum, int maxÁr){
        ArrayList<Auto> uj = new ArrayList<>();
        for(Auto a : lerakat){
            if(a.irányár < maxÁr && nemRégebbiMintDátum.compareTo(a.gyártásDátuma) >= 0){
                uj.add(a);
            }
        }
        return uj;
    }
    public ArrayList<Auto> Keres(Date nemRégebbiMintDátum, int minÁr, int maxÁr){
        ArrayList<Auto> uj = new ArrayList<>();
        for(Auto a : lerakat){
            if(a.irányár < maxÁr && nemRégebbiMintDátum.compareTo(a.gyártásDátuma) >= 0 && a.irányár > minÁr){
                uj.add(a);
            }
        }
        return uj;
    }
}
