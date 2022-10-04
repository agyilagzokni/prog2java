public class Kutya implements TudUgatni{

    private String név;
    private String fajta;
    private int lábakSzáma;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Kutya)) return false;
        Kutya masik = (Kutya)obj;
        return this.név.equals(masik.név) && this.fajta.equals(masik.fajta) && this.lábakSzáma == masik.lábakSzáma;
    }

    public String Ugat() {
        return "vauvau";
    }
}
