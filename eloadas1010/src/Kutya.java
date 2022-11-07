public class Kutya extends Gerinces{
    private static int counter;
    public Kutya(){
        Kutya.counter++;
    }
    public String gyorsanFut(){
        return "gyorsan" + this.fut();
    }
}
