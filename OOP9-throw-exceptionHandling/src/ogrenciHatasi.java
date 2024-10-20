//kendi hata mesajımızı yazma
public class ogrenciHatasi extends Exception {
    public ogrenciHatasi(String msg){
        super(msg);
    }
    //yani ya hatalı yeri try-catch yapısı içine alırsın ya da ilgili metodun yanına extends eder gibi throwS yapar içerde
    //throw new diye oluşturursungit 
}
