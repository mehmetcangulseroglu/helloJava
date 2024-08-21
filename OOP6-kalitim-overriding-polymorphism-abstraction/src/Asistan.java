public class Asistan extends Akademisyen {
    protected String yuksekLisans;


    Asistan(String adSoyad,String eposta,String telefon,String bolum,String gorevler,String ders,String yuksekLisans){
        super(adSoyad, eposta, telefon, bolum, gorevler, ders);
        this.yuksekLisans=yuksekLisans;
    }


    //override edildi metot
    public String giris(){
        return "asistan"+" "+super.giris();
    }


    //yuksek lisans değişkeninin getter ve setter metodları
    public String getYuksekLisans(){
        return yuksekLisans;
    }
    public void setYuksekLisans(String yuksekLisans){
        this.yuksekLisans=yuksekLisans;
    }

    //override abstract
    public void derseGir(int dersSaati){
        System.out.println(getAdSoyad()+" "+getDers()+"saat :"+dersSaati+ "dersine girdi");
    }
}
