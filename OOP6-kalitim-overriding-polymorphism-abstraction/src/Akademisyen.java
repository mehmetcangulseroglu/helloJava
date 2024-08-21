public abstract class Akademisyen extends Calisan {
    String bolum,gorevler;
    String ders;

    Akademisyen(String adSoyad,String eposta,String telefon,String bolum,String gorevler,String ders){
        super(adSoyad, eposta, telefon);
        this.bolum=bolum;
        this.gorevler=gorevler;
        this.ders=ders;
    }

    public abstract  void derseGir(int dersSaati);


    //override edildi bu metot
    public String giris(){
        return super.giris()+ " A kapısından";
        //this.adSoyad + " giriş yaptı" 2 giris metodunda da ortak o yüzden super.giris yaptık
    }

    //ders değişkeninin getter metodu
    public String getDers(){
        return ders;
    }
}
