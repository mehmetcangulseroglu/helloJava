public class Kitap {
    public String isim,yazar,yayinci;
    private int sayfaSayisi;

    Kitap(String isim,String yazar,String yayinci,int sayfaSayisi){
        this.isim=isim;
        this.yazar=yazar;
        this.yayinci=yayinci;
        if(sayfaSayisi<1){
            this.sayfaSayisi=10;
        }else{
            this.sayfaSayisi=sayfaSayisi;
        }
    }

    public int getSayfaSayisi(){//private değişkene erişebilmek için getter metodu yazdık...
        return this.sayfaSayisi;
    }

    public void setSayfaSayisi(int size){//private değişkeni değiştirmek için setter metodu yazdık setter metodlar genelde void olduğu için içine parametre alır.
        if(size<1){
            System.out.println("sayfa sayısı negatif olamaz...");
            this.sayfaSayisi=10;
        }else{
            this.sayfaSayisi=size;
        }
    }


}
