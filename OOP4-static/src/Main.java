
public class Main {
    public static void main(String[] args) {
        System.out.println("online öğrenci sayısı : "+ogrenciBilgi.howStudent());
        ogrenciBilgi ogrblg = new ogrenciBilgi("ahmet",340);
        ogrenciBilgi ogrblg2 = new ogrenciBilgi("ayşe",230);
        ogrenciBilgi ogrblg3 = new ogrenciBilgi("fatma",760);
        System.out.println("online öğrenci sayısı : "+ogrenciBilgi.howStudent());

        ogrblg2.cikis();
        System.out.println("online öğrenci sayısı : "+ogrenciBilgi.howStudent());
    }
}