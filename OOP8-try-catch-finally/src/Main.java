
public class Main {
    public static void main(String[] args) {
        /* //hatalı kod
        System.out.println("program başladı ");
        int a=2/0;
        System.out.println(a);
        System.out.println("program bitti");
        */

        //hata olabilecek kısmı try=dene içine alacağız catch=yakala ile catch içinde hatayı yakalayacağız catch içine konsoldaki hata mesajı yazılır
        /*System.out.println("program başladı");
        int a = 0;
        try{
            a=2/0;
        }catch (ArithmeticException err){
            System.out.println(err.toString());//catch mesajını getMessage veya toString ile alırız
        }
        System.out.println("program bitti");*/

        //try içindeki kodda hata varsa try skopları içinde ne olursa olsun orası çalışmaz
        /*System.out.println("program başladı");
        int[] dizi=new int[3];
        dizi[4]=10;
        System.out.println("program bitti");*/
        //3 boyutlu bir dizi tanımlandı ama 4.indekse eleman eklendi hatalı kod

        //try-catch li haline bakalım
        /*System.out.println("program başladı");
        int[] dizi = new int[3];
        try{
            dizi[4]=10;
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err.toString());
        }finally {
            System.out.println("finally kısmı");
        }*/
        //try olmadan catch yazamazsın
        //alt alta istediğin kadar catch yazabilirsin
        //en son catch olarak genel olarak hatayı bulsun diye catch(Exception err) de yazabilirsin
        //finally catchlerin sonuna yazılır hata olsun olmasın içindeki mesaj her türlü çalışır



        
    }
}