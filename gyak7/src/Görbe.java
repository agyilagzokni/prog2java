import java.util.ArrayList;
import java.util.List;

/*

 */
public class Görbe {
    static class Pont{
        public double x,y;
        @Override
        public String toString(){
            return "x: "+x+" y: "+y;
        }
    }
    private List<Pont> feszitoPontok = new ArrayList<>();
    public void addFeszítőPont(Pont p){
        if (feszitoPontok.size() < 5) {
            feszitoPontok.add(p);
        }
    }
    public void removeFeszítőPont(int index){
        feszitoPontok.remove(index);
    }
    @Override
    public String toString(){
        String ki = "";
        for (Pont p: feszitoPontok) {
            ki += p.toString();
            ki += ";";
        }
        return ki;
    }

}
