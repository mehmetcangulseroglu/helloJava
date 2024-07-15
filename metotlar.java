public class metotlar {
    public static void main(String[] args){
        //welcome(5);
        //usAlma(2,3);
        //System.out.println(usAl(4,2));

        //System.out.println(topla(1,2));
        //System.out.println(topla(1,2,5));
        //System.out.println(topla(1,2,7.0));

        System.out.println(f(5) );
    }


    //metotlar dönüş tipine göre ikiye ayrılır return ve void tipi.---örn1 ve örn2 de void tipe baktık.
    //örn1
    static void welcome(int x){
        int sonuc = (x+2)*6;
        System.out.println(sonuc);
    }
    //örn2
    static void usAlma(int sayi1,int sayi2){
        int sonuc = 1;
        for(int i=1;i<=sayi2;i++){
            sonuc*=sayi1;
        }
        System.out.println("sonucunuz : "+sonuc);
    }

    //şimdi return tipi metotlara bakalım. Bunlar geriye değer döndürür...
    //void olunca ordaki değişkeni main fonksiyonda atama yapamaz kullanamazsın.
    //ama return tipi kullanınca kullandığın fonksiyonu main fonksiyonda değişkene atayabilirsin kullanabilirsin vs...
    static int usAl(int a,int b){
        int sonuc2=1;
        for(int i=1;i<=b;i++){
            sonuc2*=a;
        }
        return sonuc2;
    }

    //metotlarda overloading(aşırı  yüklenme) nedir ?...
    //normalde aynı isimde metot oluşturulmaz ama overloading yaparken aynı isimde olan metotları farklı metotlarmış gibi işleme sokarız.
    //yani metotların ismi aynı ama içine gönderilen parametre sayısı farklı olarak bindirme,yükleme.

    static int topla(int k,int m){
        return k+m;
    }
    static int topla(int k,int m,int l){
        return k+m+l;
    }
    static double topla(int k,int m,double l){
        return k+m+l;
    }

    //recursive(özyinelemeli)metotlar...

    //metot içinde tekrar kendini bir daha çağıran metotlara denir.
    //recursive metotlarda return tipi metotlar kullanılır void kullanılmaz.

    //1 den girilen sayıya kadar olan sayıların toplamını recursive ile veren program.
    static int f(int x){
        if(x==1){
            return 1;
        }
        return x+f(x-1);
    }

}
