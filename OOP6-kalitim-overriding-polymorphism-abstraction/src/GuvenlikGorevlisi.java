public class GuvenlikGorevlisi extends Memurlar{
    String belge;

    GuvenlikGorevlisi(String adSoyad,String eposta,String telefon,String departman,String mesai,String belge){
        super(adSoyad, eposta, telefon, departman, mesai);
        this.belge=belge;
    }

}
