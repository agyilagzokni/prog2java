public class Gázkazán {
    private boolean fűtE;
    private int belsőHőmérséklet;

    public Gázkazán(){
        fűtE = false;
        belsőHőmérséklet = 20;
    }

    public void tik(){
        if (belsőHőmérséklet < 20){
            fűtE = true;
        }else if(belsőHőmérséklet > 80){
            fűtE = false;
        }
        if(fűtE){
            belsőHőmérséklet += 15;
        }else{
            belsőHőmérséklet -= 5;
        }
    }


}
