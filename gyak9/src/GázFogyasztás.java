import java.text.SimpleDateFormat;
import java.util.*;

public class GázFogyasztás {
    private ArrayList<GregorianCalendar> datumok = new ArrayList<>();
    private ArrayList<Double> fogyasztasok = new ArrayList<>();

    public void add(GregorianCalendar date, double fogyasztas){
        if(!datumok.contains(date)){
            datumok.add(date);
            fogyasztasok.add(fogyasztas);
        }
    }
    public String maxFogyasztás(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        double max = 0;
        for (double d : fogyasztasok) {
            if (d > max){
                max = d;
            }
        }
        GregorianCalendar datum = datumok.get(fogyasztasok.indexOf(max));
        sdf.setCalendar(datum);
        return "datum: "+sdf.format(datum.getTime()) + " fogyasztas: " + max;
    }
    public double atlag(){
        double sum = 0;
        for(double d : fogyasztasok){
            sum += d;
        }
        return sum/fogyasztasok.size();
    }
    public double évÁtlaga(int év){
        double sum = 0;
        double count = 0;
        for (GregorianCalendar d : datumok){
            if(év == d.get(Calendar.YEAR)){
                count++;
                sum += fogyasztasok.get(datumok.indexOf(d));
            }
        }
        return sum/count;
    }
    public double évHónapÁtlaga(int év, int hónap) {
        double sum = 0;
        int count = 0;
        for (GregorianCalendar d : datumok) {
            if (év == d.get(Calendar.YEAR) && hónap == d.get(Calendar.MONTH)) {
                count++;
                sum += fogyasztasok.get(datumok.indexOf(d));
            }
        }
        return sum / count;
    }
    public double évHétÁtlaga(int év, int hét) {
        double sum = 0;
        int count = 0;
        for (GregorianCalendar d : datumok) {
            if (év == d.get(Calendar.YEAR) && hét == d.get(Calendar.WEEK_OF_YEAR)) {
                count++;
                sum += fogyasztasok.get(datumok.indexOf(d));
            }
        }
        return sum / count;
    }
}
