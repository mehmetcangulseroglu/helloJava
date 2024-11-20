
public class Main {
    public static void main(String[] args) {
        //nonstatic sınıfı ile ilgili işlemler
        NonStatic n = new NonStatic();
        NonStatic.Inner inner = n.new Inner();
        inner.kos();

        //static sınıfı ile ilgili işlemler
        Static.Inner s=new Static.Inner();
        s.run();
    }
}