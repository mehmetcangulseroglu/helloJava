import java.util.*;
public class Main {
    public static void main(String[] args) {

                                                    //COLLECTİONS
                                    //SET YAPILARI-HASHSET-LİNKEDHASHSET-TREESET
                                                    // HASHSET
      //hashset yapısını görelim...
      //veriler hashler ile tutulur dolayısıyla listeye girdikleri gibi çıkmaları beklenmez
      //aynı elemandan listede 2 adet bulunamaz eklesen bile sadece birini listede tutar
      HashSet h = new HashSet();//normal hashset yapısında generic (<>) vardır ilerde göreceğiz
      h.add("12");
      h.add(12);
      h.add(12.0);
      h.add(true);
      h.add(null);
      h.remove("12");
      //h.clear();
      System.out.println(h.contains(14));

      h.forEach(item -> System.out.println(item+",")); // listeyi böyle de dolaşabilirsin
      //listeyi dolaşmak için ıterator sınıfından polymorphism ile nesne oluşturulur
      /*Iterator ıtr = h.iterator();

      while(ıtr.hasNext()){//boş mu diyor aslında liste için
          System.out.println(ıtr.next());//sonraki elemana geçmek
      }*/

                                                    //LİNKEDHASHSET
      //girilen değere göre çıkış var hashsetten farkı bu
      //aynı elemandan yine 2 tane ekleyemezsin
      LinkedHashSet gunler = new LinkedHashSet();
      gunler.add("pazartesi");
      gunler.add("salı");
      gunler.add("çarşambba");
      //ekrana basma-iterator veya foreach ile
      gunler.forEach(item -> System.out.println(item+","));

                                                    //TREESET
      //elementleri artan bir sırayla sıralayıp bizlere verir
      //null değeri eklenmez hata verir

      TreeSet tree = new TreeSet();
      tree.add(10);
      tree.add(1);
      tree.add(2);
      tree.add(6);
      //ekrana basma. item ismi temsilidir kafana göre ad verebilirsin.
      tree.forEach(item -> System.out.println(item+","));
                                     //LİST YAPILARI-ARRAYLİST-LİNKEDLİST-VECTOR
                                                    //ARRAYLİST
      ArrayList country = new ArrayList();
      country.add("istanbul");
      country.add("ankara");
      country.add("izmir");
      country.add("ankara");//list yapılarında aynı elemandan birden fazla sayıda bulunabilir.

      country.remove("istanbul");
      country.remove(1);
      //ekrana basma
      country.forEach(item -> System.out.println(item));

                                                    //LİNKEDLİST
      //arraylistle benzer kullanım alanları değişiyor burda da aynı elemandan birden fazla olabilir.
      LinkedList list = new LinkedList();
      list.add("karpuz");
      list.add("elma");
      list.add("ananas");

      list.add(1,"çilek");

      list.remove(1);
      //ekrana basma
      list.forEach(item -> System.out.println(item));

                                                   //QUEUE YAPILARI-QUEUE LİNKEDLİST-PRİORİTY QUEUE

                                                  //QUEUE LİNKEDLİST
      //Araya eleman ekleyemiyoruz,diğer list yapılarında olduğu gibi ilk giren ilk çıkar mantığı var
      //element()=kuyruğun başındaki elemanı verir ama kuyruktan atmaz
      //offer()=mümkünse verilen ögeyi kuyruğa ekler
      //peek()=kuyruğun başındaki ögeyi verir ama onu kuyruktan atmaz kuyruk boşsa null verir
      //poll()=kuyruğun başındaki ögeyi verir ve onu kuyruktan atar kuyruk boşsa null verir
      //remove()=kuyruğun başındaki ögeyi verir ve onu kuyruktan atar

      Queue q = new LinkedList();//queue sınıfından list böyle oluşturulur=polymorphism ile.
      q.add("deniz");
      q.add("mehmet");
      q.offer("ali");
      q.offer("damla");

      System.out.println(q.element());
      System.out.println(q.peek());
      System.out.println(q.remove());
                                                  //PRİORİTY QUEUE
      //queue mantığıyla aynı kullanılan şeylerde aynı tek farkı bir öncelik sıralaması olur burda ve buna bizde müdahale edebiliriz compare yapısıyla
      PriorityQueue p = new PriorityQueue();//Queue q = new PriorityQueue diye de oluşturulabilirdi
      p.add(80);
      p.add(20);
      p.add(10);
      p.add(50);

      //ekrana basma farklı
      while(!p.isEmpty()){
        System.out.println(q.poll());
      }



    }

}
