import java.util.Random;

public class Kutya {
    private String név;
    private double súly;
    private boolean mérges;
    public Kutya(){ //konstruktor
        név = "Buksi";
        súly = 5.2;
    }

    public String getNév() {
        return név;
    }
    public void setNév(String név){
        this.név = név;
    }

    public void setMérges(boolean mérges) {
        this.mérges = mérges;
    }

    public boolean isMérges() {
        return mérges;
    }
    public String ugat(){
        if(mérges){
            return "grrgrr";
        }else{
            return "vauvau";
        }
    }
    public int randomSzám(){
        Random rand = new Random();
        int szám = rand.nextInt(0, 30);
        return szám;
    }
}
