import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class KönyvesPolc {
    static class Könyv{
        String cím;
        String[] szerzők;
        int kiadásDátuma;
        public Könyv(String cím, String[] szerzők, int kiadás){
            this.cím = cím;
            this.szerzők = szerzők;
            this.kiadásDátuma = kiadás;
        }
    }
    private ArrayList<Könyv> könyvek = new ArrayList<>();
    public void addKönyv(Könyv k){
        könyvek.add(k);
    }
    public ArrayList<Könyv> CímSzerintCsökkenő(){
        ArrayList<Könyv> rendezettLista = könyvek;

        Collections.sort(rendezettLista, Collections.reverseOrder());

        return rendezettLista;
    }

}
