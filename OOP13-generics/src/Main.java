import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //normalde collection yapılarında generics olmadan sınıfları oluşturduk ve 1 türde işlem yapabildik ama generics kullanarak
        //daha genel çalışabiliriz veya generics içine tür belirtip daha dar bir alanda çalışabiliriz

        ArrayList<String> a = new ArrayList<>();//collection yapılarında generics kullanımı
        a.add("istanbul");
        a.add("bursa");
        //generics yapısı kullandıysak listeyi artık foreachle ekrana basabiliriz
        for(String bas:a){
            System.out.println(bas);
        }

        //map yapılarında key value olduğu için generics 2 değer alır içine
        HashMap<Integer,String> h = new HashMap<>();//map yapılarında collection kullanımı
        h.put(1,"adana");
        h.put(6,"ankara");
        h.put(34,"istanbul");
        //ekrana basmak key ve valueler için ayrı ayrı olur türlerine dikkat yanlış yazman keyler int valueler str mesela
        for(Integer hd: h.keySet()){
            System.out.println(hd);//keyler ekrana basıldı=keyset()
        }
        for (String hdd: h.values()){
            System.out.println(hdd);//valueler ekrana basıldı=values()
        }

        //sınıflarda generics nasıl kullanılır bakmak için Test sınıfına baktık ve buraya geldik
        //Test sınıfından geldik ve generics bir sınıfın nesnesi nasıl oluşturulur bakalım...
        //normal nesne oluşturur gibi oluştur sadece genericsleri ekle sınıf adlarının yanına
        Test<Integer> i = new Test<>(15);
        System.out.println(i.getObj());


        //en son metotlarda generics yapısı nasıl kullanılır ona bakmak için genericsMethod adında bir sınıf oluşturduk oraya bakalım

    }
}
