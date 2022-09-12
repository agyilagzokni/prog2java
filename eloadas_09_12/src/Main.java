public class Main {
    public static void main(String[] args) {
        Kutya k1 = new Kutya();
        System.out.println(k1.getNév());
        k1.setMérges(true);
        System.out.println(k1.ugat());
    }
}
