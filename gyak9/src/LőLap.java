import java.util.ArrayList;

public class LőLap {
    ArrayList<Double> pontok = new ArrayList<>();
    public void add(double pont){
        if( pont >= 0 && pont <= 10){
            pontok.add(pont);
        }
    }
    public double átlag(){
        double sum = 0;
        for (double pont : pontok) {
            sum += pont;
        }
        return sum/pontok.size();
    }
    public double max(){
        double max = 0;
        for (double pont : pontok){
            if (pont > max){max = pont;}
        }
        return max;
    }
    public int count10(){
        int count = 0;
        for(double pont : pontok){
            if(pont == 10){count++;}
        }
        return count;
    }
    public int Xnélnagyobb(double x){
        int count = 0;
        for(double pont : pontok){
            if(pont >= x){count++;}
        }
        return count;
    }
}
