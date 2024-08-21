
public class Main {
    public static void main(String[] args) {
        //Akademisyen a = new Akademisyen("ahmet", "a@gmail.com", "05550000000", "ceng", "hoca", "ceng 101");
        //System.out.println(a.giris());

        Calisan c = new Calisan("veli", "a@gmail.com", "05550000000");
        //System.out.println(c.giris());

        OgretimUyesi o = new OgretimUyesi("mehmet", "a@gmail.com", "05550000000", "ceng", "hoca", "ceng 101", "doç dr");
        //System.out.println(og.giris());

        Asistan as = new Asistan("rumeysa", "a@gmail.com", "05550000000", "ceng", "hoca", "ceng 101", "yapay zeka");
        //System.out.println(as.giris());

        Memurlar m = new Memurlar("fatih", "a@gmail.com", "05550000000","IT","8-5");


        //polymorphism = newin sağ tarafı sol taraftaki sınıfın alt sınıfı ise bu şekil kullanım olabilir ve bu polymorphismdir.
        //Calisan vb = new Akademisyen("mehmet", "a@gmail.com", "05550000000", "ceng", "hoca", "ceng 101");
        //System.out.println(vb.giris());//new in sağındaki sınıf gibi davranır böyle üretilen objeler.


        //normal dizi oluşturma mantığı
        //int[] array = new int[5];
        //int[] array1={};

        //tür yerine sınıf ismi verilerek oluşan dizi mantığı=sadece bu sınıftaki verileri veya bu sınıfın alt sınıfına ait verileri içine alan bir dizi
        //Akademisyen[] array2 = new Akademisyen[5];


        //Akademisyen[] array3 ={a,o,m};//memurlar sınıfından oluşan m nesnesinde hata olacak çünkü memurlar akademisyen sınıfı da değil alt sınıfı da değil
        //bu yüzden daha genel tanımlayalım ata sınıfı kullanalım


        //Calisan[] girisListesi={a,o,m};//sınıflardan obje olarak aldığımız kişi bilgilerini bir diziye atadık
        //Calisan.liste(girisListesi);//statik metot olduğu için sınıf ismiyle çağırabildik

        o.derseGir(10);

    }
}