public class Car {
    private int motorGucu,model;
    public int hiz;
    protected String renk;

    //constructoru oluşturalım...
    Car(){
        this.hiz=120;
        this.model=2020;
        this.renk="kırmızı";
        this.motorGucu=300;
    }

    private void ekranaYazdir(){//public tanımlamaz private tanımlarsak main sınıfta çağıramayız ama
        //aşağıda olduğu gibi yeni bir public metot içinde private olanı çağırır basabiliriz mantık oyunu.
        //tabi direkt public olarak tanımlamak da var ekranaYazdir() metodunu :)
        System.out.println(model);
    }

    public void kos(){
        ekranaYazdir();
    }

}
