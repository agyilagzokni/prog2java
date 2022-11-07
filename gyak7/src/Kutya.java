class Kutya { //outer class
    class Pont{public int x, y;}
    public static class KutyaBőr{
        public double String;
    }
    private class KajaABendőben { //inner class
        //ha azert csinalod az osztalyt hogy adatszerkezet legyen akkor lehetnek a mezok publicok
        public int csirkeCombSzámláló = 0;
        public int kutyaKajaSzámláló = 0;
        public int egyébKalória = 0;

        @Override
        public String toString() {
            return "cs. comb = " + csirkeCombSzámláló + ", kutyakaja = " + kutyaKajaSzámláló + ", egyéb = " + egyébKalória;
        }
    }

    /*
    public static final int lábakSzáma;
    static {
        //static blokk, egyszer fut le, nem lehet sehogy meghivni
        // automatikusan hivodik amikor meghivodik az osztaly
        //arra hasznaljuk ha config fajlbol beolvassuk az értékeket
        //ha az értékadásnak valami logikaja van, akkor ide kell azokat az utasitasokat irni
        //static inicializáció
        lábakSzáma = 4;
    }*/
    private KajaABendőben bendő = new KajaABendőben();

    public void egyélCsirkeCombot() {
        bendő.csirkeCombSzámláló++;
    }

    @Override
    public String toString() {
        return "bendő = " + bendő.toString();
    }
}
