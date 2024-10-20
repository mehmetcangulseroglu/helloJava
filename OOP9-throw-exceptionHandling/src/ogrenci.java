public class ogrenci {
    //ÖNEMLİ bir metoda hata ayıklama yapacaksan main metot veya herhangi bir metot olabilir yanına extends yapar gibi throwS entegre etmelisin
    //şimdi bunun örneğini görelim
    public ogrenci bul(String id) throws Exception {
        if(id.equals("123")){
            return new ogrenci();
        }else{
            throw new ogrenciHatasi("ogrenci bulunamadı");
        }
    }
}
