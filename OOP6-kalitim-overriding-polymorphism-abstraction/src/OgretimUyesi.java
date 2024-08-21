public class OgretimUyesi extends Akademisyen{
    protected String unvan;

    OgretimUyesi(String adSoyad,String eposta,String telefon,String bolum,String gorevler,String ders,String unvan){
        super(adSoyad, eposta, telefon, bolum, gorevler, ders);
        this.unvan=unvan;
    }


    //override edildi metot
    public String giris(){
        return this.unvan+" "+this.adSoyad+" giriş yaptı B kapısından ";
    }
    //unvan degiskeninin getter metodu
    public String getUnvan(){
        return unvan;
    }

    public void derseGir(int dersSaati){
        System.out.println(getUnvan()+" "+getAdSoyad()+" "+getDers()+"saat :"+dersSaati+ "dersine girdi");
    }
}
