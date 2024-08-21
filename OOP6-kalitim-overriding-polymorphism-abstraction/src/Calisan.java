public class Calisan {
    protected String adSoyad,eposta,telefon;

    Calisan(String adSoyad,String eposta,String telefon){
        this.adSoyad=adSoyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

    public String giris(){
        return this.adSoyad +" giriş yaptı";
        //System.out.printl(adSoyad+"giris yaptı"); ile aynı şey fakat metot olduğu için return tercih ediyoruz.
    }

    //adSoyad değişkeninin getter ve setter metodları
    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }
    //eposta değişkeninin getter ve setter metodları
    public String getEposta(){
        return eposta;
    }
    public void setEposta(String eposta){
        this.eposta=eposta;
    }
    //telefon değişkeninin getter ve setter metodları
    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }

    public static void liste(Calisan[] girisYapanlar){
        for (Calisan c:girisYapanlar) {
            System.out.println(c.giris());
        }
    }








}
