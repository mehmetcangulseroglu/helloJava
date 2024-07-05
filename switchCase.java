import java.util.Scanner;
public class switchCase {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz :");
        int sayi =input.nextInt();
        switch (sayi){
            case 1 :
                System.out.println("sayi 1 dir"); break;
            case 2 :
                System.out.println("sayi 2 dir"); break;
            case 3 :
                System.out.println("sayi 3 dir"); break;
            default :
                System.out.println("1,2,3 dışında sayi girdiniz");
        }
    }
}
