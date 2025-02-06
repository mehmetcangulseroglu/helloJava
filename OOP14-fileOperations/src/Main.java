import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //dosya işlemlerine bakalım...
        File file = new File("kod.txt");//dosya oluşturuldu

        if(!file.exists()){
            file.createNewFile();//dosya oluşmadıysa oluştur kısmı
        }

        //dosyamızın oluştu içine bir şeyler ekleyelim
        //dosya içine yazmak için FileWriter kullanacaz ve hemen arkasına tampon görevli BufferedWriter
        String val = "Mehmet Can Gülseroğlu";//bu değişkeni dosyamıza yazalım
        FileWriter fWriter=new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        bWriter.write(val);//val değişkeni dosyaya yazıldı
        bWriter.write("\nmühendis");//değişken kullanmadan bu şekilde dosyaya yazabilirsin
        bWriter.close();//her yazma ve okuma işlemi sonrası bWriter ve bReader kapatılmalı bellekte yer kaplamaması için

        //dosyamıza bir şeyler yazdık şimdi okuyalım
        //okuma işlemi FileReader ile olacak ve hemen arkasına BufferedReader olmalı
        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader= new BufferedReader(fReader);

        while((line = bReader.readLine())!=null){//okuduğun dosyadaki satırlar boş değilse line değişkenine ata ve bastır
            System.out.println(line);
        }
        bReader.close();

    }
}