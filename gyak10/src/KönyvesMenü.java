import java.util.ArrayList;
import java.util.Scanner;

public class KönyvesMenü {
    class KönyvesPolc{
        String név;
        double teherbírás;
        String megjegyzés;
        ArrayList<Könyv> könyvek;
        public KönyvesPolc(String név, double teherbírás, String megjegyzés){
            this.név = név;
            this.teherbírás = teherbírás;
            this.megjegyzés = megjegyzés;
            this.könyvek = new ArrayList<>();
        }
        public void add(String cím, String szerző, double súly){
            könyvek.add(new Könyv(cím, szerző, súly));
        }
    }
    class Könyv{
        private static int count = 0;
        int id;
        String cím;
        String szerző;
        double súly;
        public Könyv(String cím, String szerző, double súly){
            this.cím = cím;
            this.szerző = szerző;
            this.súly = súly;
            id = count++;
        }
    }
    class Menü{
        private int aktivMenü = 0; // 0 - főmenű, 1 - könyvespolc, 2 - könyv
        private KönyvesPolc aktivPolc = null;
        private ArrayList<KönyvesPolc> polcok = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        public void kiválasztás(){

            if(aktivMenü == 0){
                System.out.println("Válassz ki egy menüt! \n 1 - Könyvespolc menü \n 2 - Könyv menü");
                input.useDelimiter("\n");
                int menu = input.nextInt();
                switch(menu){
                    case 1: aktivMenü = 1;break;
                    case 2: aktivMenü = 2;break;
                }
            }else if(aktivMenü == 1){
                System.out.println("Válassz ki egy lehetőséget! \n 1 - Könyvespolc felvétele \n 2 - Aktív könyvespolc kiválasztása\n 3 - Könyvespolc törlése név alapján\n4 - Vissza a főmenübe");
                int menu = input.nextInt();
                switch(menu){
                    case 1:
                        System.out.println("Név, Teherbírás, Megjegyzés");
                        String név = input.next();
                        double teherbiras = input.nextDouble();
                        String megjegyzes = input.next();
                        addPolc(név, teherbiras, megjegyzes);
                    case 2:
                        System.out.println("Nevezd meg azt a polcot, amit aktivvá akarsz tenni!");
                        String névaktiv = input.next();
                        aktivPolcKiválasztása(névaktiv);
                    case 3:
                        System.out.println("Nevezd meg azt a polcot, amit törölni akarsz!");
                        String névtörlés = input.next();
                        PolcTörléseNévAlapján(névtörlés);
                    case 4:
                        aktivMenü = 0;
                }
            }else if(aktivMenü == 2){
                System.out.println("Válassz ki egy lehetőséget! \n 1 - Könyv hozzáadása az aktív polchoz\n2 - Könyv törlése id alapján\n3 - Vissza a főmenübe");
                int menu = input.nextInt();
                switch(menu){
                    case 1:
                        System.out.println("Cím, Szerző, Súly");
                        String cím = input.next();
                        String szerző = input.next();
                        double súly = input.nextDouble();
                        addKönyv(cím, szerző, súly);
                    case 2:
                        System.out.println("Add meg annak a könyvnek az id-jét amit törölni akarsz!");
                        int id = input.nextInt();
                        KönyvTörléseIDAlapján(id);
                    case 3:
                        aktivMenü = 0;
                }
            }
            this.kiválasztás();
        }
        //polc
        public void addPolc(String név, double teherbiras, String megjegyzés){
            polcok.add(new KönyvesPolc(név, teherbiras, megjegyzés));
        }
        public void aktivPolcKiválasztása(String név){
            for(KönyvesPolc p : polcok) {
                if (p.név.equals(név)) {
                    aktivPolc = p;
                }
            }
        }
        public void PolcTörléseNévAlapján(String név){
            polcok.removeIf(p -> p.név.equals(név));
        }
        public double KönyvSúlySum(){
            double sum = 0;
            for(Könyv k : aktivPolc.könyvek){
                sum += k.súly;
            }
            return sum;
        }
        //könyv
        public void addKönyv(String cím, String szerző, double súly){
            if(aktivPolc == null){
                try{
                    throw new Exception("Nincs aktiv polc");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else{
                if(KönyvSúlySum() + súly < aktivPolc.teherbírás){
                    aktivPolc.add(cím, szerző, súly);
                }else{
                    try{
                        throw new Exception("Nem bírja el a polc, kérem válasszon másik polcot!");
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        public void KönyvTörléseIDAlapján(int id){
            for(KönyvesPolc polc : polcok){
                for(Könyv k : polc.könyvek){
                    if(k.id == id){
                        polc.könyvek.remove(k);
                        break;
                    }
                }
            }
        }
    }
}
