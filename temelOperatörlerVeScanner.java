import java.util.Scanner;
public class temelOperatörlerVeScanner {
    public static void main(String args[]){
        int a =10;
        int b = 5;
        int toplam = a+b;
        int cikarma =a-b;
        int carpma =a*b;
        int bolme =a/b;
        int mod=a%b;
        System.out.println("toplama :"+toplam);
        System.out.println("çıkarma :"+cikarma);
        System.out.println("çarpma :"+carpma);
        System.out.println("bölme :"+bolme);
        System.out.println("mod :"+mod);

        //arttırma - azaltma(++,--)
        toplam++;//toplam=toplam+1
        System.out.println(toplam);
        cikarma--;
        System.out.println(cikarma);

        int sonuc = a++ + b--;
        System.out.println(sonuc);//15

        int sayi1=10;
        int sayi2=5;

        boolean kosul1=(sayi1>sayi2);
        boolean kosul2=(sayi1<sayi2);

        boolean sonuc2=(kosul1==true && kosul2==true);// ||(veya) da kullanılabilirdi.
        System.out.println(sonuc2);

        //kullanıcıdan veri alma =Scanner...
        Scanner input = new Scanner(System.in);//import java.util.Scanner; eklenmeli
        //System.out.println("bir sayi giriniz : ");
        //int sayi = input.nextInt();//veya sayi int sayi; diye yukarda tanımlanır. sayi=input.nextInt() yapılır.

        System.out.println("isim girin");
        String isim=input.nextLine();//str değerleri alırken next de olur nextline da fark şu next olursa girilen str de boşluk gördüğü an keser.
        System.out.println(isim);





    }
}
