
public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("harry potter","mehmet","ahmet",400);
        //kitap.sayfaSayisi=-400;//fakat sayfa sayısının -400 olması mantıklı değil. o yüzden bu değişkeni private ayarlayalım.

        System.out.println(kitap.getSayfaSayisi());//mevcut sayfa sayısı
        kitap.setSayfaSayisi(550);//sayfa sayısı değişti
        System.out.println(kitap.getSayfaSayisi());//yeni sayfa sayısı

        kitap.setSayfaSayisi(-550);
        System.out.println(kitap.getSayfaSayisi());
    }
}