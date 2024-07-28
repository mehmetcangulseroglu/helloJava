public class ogrenciBilgi {
    public String isim;
    public int id;
    private  static int sayac=0;//static bir değişken olduğu için ana sınıfta sınıf adı. ile ulaşabilirsin private olmamalı ama


    ogrenciBilgi(String isim,int id){
        this.id=id;
        this.isim=isim;
        ogrenciBilgi.sayac++;
    }
    public void cikis(){
        ogrenciBilgi.sayac--;
    }

    public static int howStudent(){//static bir metot olduğu için sınıf adı. ile çağrılır nesne üretmeye gerek kalmaz
        return ogrenciBilgi.sayac;
    }

}
