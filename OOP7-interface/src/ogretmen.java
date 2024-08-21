public class ogretmen implements ICalisan {
    private String adSoyad,bolum,gorevler;

    ogretmen(String adSoyad, String bolum, String gorevler){
        this.adSoyad=adSoyad;
        this.bolum=bolum;
        this.gorevler=gorevler;
    }
    //interface sınıftaki metotları diğer alt sınıflarda yazmalıyız dedik...
    @Override
    public void giris(){
        System.out.println("giris yapıldı");
    }
    @Override
    public void cikis(){
        System.out.println("çıkış yapıldı");
    }
    @Override
    public boolean yemek(int saat){
        System.out.println("yemek yendi...");
        return true;
    }

    //private değişkenlerin getter ve setter metodları
    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }

    public String getBolum(){
        return bolum;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }

    public String getGorevler(){
        return gorevler;
    }
    public void setGorevler(String gorevler){
        this.gorevler=gorevler;
    }

}

