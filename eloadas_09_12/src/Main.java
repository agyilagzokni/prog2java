public class Main {
    public static void main(String[] args) {
        Kutya k1 = new Kutya();
        k1.setNév("Kovács Kristóf");
        System.out.println(k1.getNév());
        k1.setMérges(false);
        System.out.println(k1.ugat());
        System.out.println(k1.randomSzám());
    }
}
