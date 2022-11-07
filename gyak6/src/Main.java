public class Main {
    public static void main(String[] args) {
        Kutya k1 = new Kutya();
        System.out.println(k1.ugat());
    }
    /*
    interfaceek hierarchiája
    kulcsszava extends
    osztalyok esetén extends utan csak 1 dolog van
    interface hierarchiaban nincs ilyen kötés
    interface nem implementalhat

    az I3nak két metodusa foo() és bar()
    foo()-t örökli I1-ből
    bar()-t örökli I2ből

    osztalyban két dolog lehet:
     - mező
     - metodus
    osztalyban nemcsak mezo és metodus, hanem ezentul lehet belso osztaly, belso interface
    azaz classon belül lehet class
     */
}
