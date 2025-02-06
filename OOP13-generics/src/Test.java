//collection ve map yapılarında generics kullanımını gördük şimdi sınıflarda nasıl kullanılıyor ona bakalım...
//sınıf adının yanına gelir <> işaretleri içinde t yazıyor o her tür olabilir diyor istediğini diyebilirsin sen oraya
public class Test<T> {
    T obj;//t türünde bir obje oluşturduk obj adında

    Test(T obj){//sınıfın constructor yapısını oluşturduk
        this.obj=obj;
    }

    public T getObj(){//obj ye ulaşmak için get metodu yazıldı türü T idi zaten türü int olsa int gelirdi oraya normal metot yazımı
        return this.obj;
    }

    //main sınıfa gidelim ve bu sınıfın nesnesini oluşturalım ve generics olan bir sınıfın nesnesi nasıl oluşturulur görelim....

}
