
public class hp {
    public static void main(String[] args) {
        hesapMakinesi mak1=new hesapMakinesi(10,5,"siyah");

        System.out.println(mak1.sayi1);
        mak1.sayi1=12;
        System.out.println(mak1.sayi1);
        System.out.println(mak1.topla());
        System.out.println(mak1.renk);
    }
}