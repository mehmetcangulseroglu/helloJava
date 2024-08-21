//normalde public class derdik ama interface de class yerine interface yazarız
//abstract gibi boş metotlar yazarız ve alt implementlere aynı metodu dolu yazarız yoksa hata alırız
//alt sınıfları belirtmek için implements kelimesini kullanırız
//abstract dan farkı orda constructor değişken vs oluştururduk burda yapılmaz bunlar
public interface ICalisan {
    final String okul="etu";


    public void giris();
    public void cikis();
    public boolean yemek(int saat);

}