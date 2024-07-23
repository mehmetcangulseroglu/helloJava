import java.util.Scanner;
public class DizilerForeach {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        //TEK BOYUTLU DİZİLER...

        int[] array = new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;

        //System.out.println(array[0]);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        //sayılar konsoldan girilsin diziye aktaralım...
        System.out.println("lütfen sırasıyla 4 sayı giriniz ");

        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


        //ÇOK BOYUTLU DİZİLER...
        //[satır][sütun] diye temsil eder 2 boyutlu dizilerde

        //çok boyutlu dizi tanımlama 1.yöntem...
        int[][] tablo = new int[][]{
            {1,75,10},
            {2,87,13},
            {3,95,15},
            {4,103,17},
            {5,110,19}
        };

        //çok boyutlu dizi tanımlama 2.yöntem...
        //indeksleme
        int[][] tablo2 = new int[5][3];
        tablo2[0][0]=1;
        tablo2[0][1]=75;
        tablo2[0][2]=10;

        //çok boyutlu dizileri ekrana yazdırma... yukardaki tablo dizisi için
        for(int k=0;k<tablo.length;k++){
            for(int l=0;l<tablo[0].length;l++){
                System.out.print(tablo[k][l]+"-");
            }
        }

        System.out.println();


        //FOREACH kullanımı.....
            //foreach sadece dizi olan yapılarda kullanılır amacı for döngüsüyle aynıdır
            for(int eleman :array){
                System.out.println("elemanlar "+eleman);
            }
        }
    }



