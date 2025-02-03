import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    //                                  hashmap-linkedhashmap-treemap
    //maplerin genelinde key-value ilişkisi vardır.ekleme ve çıkarma işlemlerinde put ve get kullanılır
    //collectionlarda add remove vs vardı
    //map yapılarında indislerle istediğin gibi oynarsın dizilerde olduğu gibi ama aynı indisten 2 tane olamaz
    //                                      HashMap
    //elemanları girilen sırada değil kendi verdiği hashlere göre tutar veri eklemek için put kullanılır
    //put(key,value) - get(key)=keye karşılık gelen valueyi döndürür - clear()=map içinde bulunan tüm değerleri siler
    HashMap b = new HashMap();
    b.put("türkiye","ankara");
    b.put("fransa","paris");
    b.put("ingiltere","londra");
    System.out.println(b.get("türkiye"));

    //                                      LinkedHashMap
    //hashmapten farkı girilen sıraya göre çıktı veriyor gerisi aynı mantık.
    LinkedHashMap ogr = new LinkedHashMap();
    ogr.put("ali",90);
    ogr.put("veli",80);
    System.out.println(ogr.get("ali"));
    //                                       treemap
    //verilen stringlere göre sıralama yapar
    TreeMap<String,Integer> ogr1 = new TreeMap<>();//bunu yapmalısın generic olmazsa burda aşağıda keySette hata alırız
    ogr1.put("ayşe",90);
    ogr1.put("berkan",43);
    ogr1.put("ceylan",54);
    ogr1.put("cafer",56);
    for(String key : ogr1.keySet()){
        System.out.println(key +"-"+ogr1.get(key));
    }
    }
}