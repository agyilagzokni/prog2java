import java.util.ArrayList;
public class Main {/*
    static int i; //value tipusu
    static Integer I; //referencia tipusu, őse az Object
    //lokalis valtozot muszaj inicializalni,
    //mezőket nem muszaj inicializalni, mert a mezők kapnak kezdőértéket
    public static void main(String[] args) {

        System.out.println("i: " + i); //0
        //I = i; //boxing, egy int becsomagol Integerbe
        //boxinggal kapott memoriacimet
        i = I; //unboxing, egy Integerből kiveszek egy intet
        System.out.println("I: " + I); //null
        I = Integer.valueOf(1); //I = 1
        i++;
        I++;

        System.out.println("i: " + i);
        System.out.println("I: " + I);
        ArrayList<Integer> myList = new ArrayList<>(); //ide barmit lehet irni ami object, csak az int az nem object
    }*/

    public static void main(String[] args) {
        /*
        Verem<Integer> v1 = new Verem<>();
        v1.push(5);
        v1.push(10);
        v1.push(15);
        System.out.println(v1.pop());
        System.out.println(v1.pop());
        System.out.println(v1.pop());
        System.out.println(v1.pop());

        Queue<Double> q1 = new Queue<>();
        q1.enqueue(1.0);
        q1.enqueue(4.0);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());*/

        Szótár<Integer, Double> sz = new Szótár<>();
        sz.add(1, 1.0);
        sz.add(5, 2.0);
        System.out.println(sz.containsKey(1));
        System.out.println(sz.containsKey(2));
        System.out.println(sz.get(5));
    }
}
//vermet fogunk csinalni, tömbbel szimulalom a vermet
//ehhez generikusat fogok hasznalni
//generikus = tipus paraméteres
//3 művelet: push, pop, top
//push: betesz, pop: kivesz, top: visszaadja a legfelsőt, de nem veszi ki
class Verem<T>{
    ArrayList<T> myverem = new ArrayList<T>(10);
    int veremteteje = -1; //nincs benne semmi
    //ha a veremteteje == 0: akkor az azt jelenti, hogy: 1 elem van benne
    public T top(){
        return myverem.get(veremteteje);
    }
    public T pop(){
        veremteteje--;
        return myverem.get(veremteteje+1);

    }
    public void push(T elem){
        veremteteje++;
        myverem.add(elem);
    }
}
//queue
//first in first out
//enqueue: betesz egy elemet a sor végére
//dequeue: kiveszi a legelsőt
//listával
//enqueue: betesz a lista végére: add művelet
//dequeue: kiveszi és ki is törli
class Queue<T>{
    ArrayList<T> myqueue = new ArrayList<>();
    public void enqueue(T elem){
        myqueue.add(elem);
    }
    public T dequeue(){
        return myqueue.remove(0);
    }
}
//alma = apple, (alma, apple), ahol az alma a kulcs, az apple az érték
//(5, öt)
//a dictionary-be sok ilyen pért tárolok
//két listaval fogom szimulalni
//egy lista kulcsoknak
//egy lista az értékeknek
//a párok ugyanazon az indexen vannak
//műveletek: add(kulcs, érték) : betesz egyet a végére
//containsKey(kulcs): igaz, ha van ilyen kulcs
//containsValue(érték): igaz, ha vna ilyen érték
//get(kulcs): visszaadja a kulcshoz tartozo értéket
class Szótár<Kulcs, Érték>{
    ArrayList<Kulcs> kulcs = new ArrayList<>();
    ArrayList<Érték> érték = new ArrayList<>();
    public void add(Kulcs k, Érték e){
        if(kulcs.contains(k)) return;
        kulcs.add(k);
        érték.add(e);
    }
    public boolean containsKey(Kulcs k){
        return kulcs.contains(k);
    }
    public boolean containsValue(Érték e){
        return érték.contains(e);
    }
    public Érték get(Kulcs k){
        return érték.get(kulcs.indexOf(k));
    }
}

//meg kell irni a boxingot és unboxingot
//boxing: int -> MyInt
//unboying: MyInt -> int
class MyInt{
    int i;
    private MyInt(int i){
        this.i = i;
    }
    public static MyInt boxing(int i) {
        return new MyInt(i);
    }
    public static int unboxing(MyInt i){
        return i.i;
    }
}