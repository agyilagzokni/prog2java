import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class HallgatóiCsoport {
    class Hallgató{
        String név;
        String szak;
        String neptunkód;
        public Hallgató(String név, String szak, String neptunkód){
            this.név = név;
            this.szak = szak;
            this.neptunkód = neptunkód;
        }
    }
    private ArrayList<Hallgató> hallgatóiCsoport = new ArrayList<>();

    public void csoportBővítése(String név, String szak, String neptunkód){
        hallgatóiCsoport.add(new Hallgató(név, szak, neptunkód));
    }

    public void kilépésNeptunKóddal(String neptunkód){
        for(Hallgató h : hallgatóiCsoport){
            if(h.neptunkód == neptunkód){
                hallgatóiCsoport.remove(h);
            }
        }
    }

    @Override
    public String toString(){
        String sz = "";
        for(Hallgató h : hallgatóiCsoport){
            sz += "Név: " + h.név + ", Szak: " + h.szak + ", Neptunkód: " + h.neptunkód + "\n";
        }
        return sz;
    }
}

class Menü{
    String név;
    ArrayList<Menü> almenük = new ArrayList<>();
    Menü szülőMenü = null;

    Scanner input = new Scanner(System.in);

    HallgatóiCsoport csoport = null;

    public Menü(String név) {this.név = név;}
    public void kiválasztás(){
        System.out.println("Válassz ki egy menüpontot! \n1 - Csoport bővítése\n2 - Kilépés Neptun kóddal\n3 - Hallgatók kiíratása");
        try {
            int menü = input.nextInt();
            input.useDelimiter("\n");
            switch(menü){
                case 1:
                    System.out.println("Név, Szak, Neptunkód");
                    String név = input.next();
                    String szak = input.next();
                    String neptunkód = input.next();
                    csoport.csoportBővítése(név, szak, neptunkód);
                    break;
                case 2:
                    System.out.println("Neptunkód: ");
                    String neptunkóda = input.next();
                    csoport.kilépésNeptunKóddal(neptunkóda);
                    break;
                case 3:
                    System.out.println("Hallgatók: \n" + csoport);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.kiválasztás();

    }



}
