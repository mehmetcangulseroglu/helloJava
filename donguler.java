import java.util.Scanner;

public class donguler {
    public static void main(String args[]){
        //while döngüsü
        int sayi=10;//başlangıç değeri
        while(sayi>0){//içeri true yazmak bir diğer sonsuz döngü yapma yöntemidir
            System.out.println(sayi);
            sayi--;//artış veya azalma değeri olmazsa sonsuz döngü olur
        }
        System.out.println("döngü bitti");

        //do-while döngüsü
        do{
            System.out.println(sayi);
            sayi--;
        }while(sayi>0);

        //for döngüsü
        for(int i=1;i<=5;i++){
            System.out.println((i));
        }

        //break(döngüyü durdurur) ve continue(döngüyü durdurmaz bir sonraki adıma gider)
        Scanner input =new Scanner(System.in);
        while(true){
            System.out.println("bir sayi giriniz : ");
            int sayi2 =input.nextInt();
            if(sayi2==0){
                break;
            }
        }

        for(int i=1;i<=10;i++){
            if(i==4 || i==9){
                continue;
            }
            System.out.println(i);
        }
        
    }
}
