import javax.swing.*;
import java.awt.*;

//layoutların yapısına bakalım...
//BorderLayout, FlowLayout, GridLayout
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class Layouts {
                                            //borderlayout örneği....
    // Çerçeve oluştur
    JFrame frame = new JFrame("BorderLayout Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

    // BorderLayout düzenini ayarla
        frame.setLayout(new BorderLayout());

    // Butonları oluşturduk
    JButton btn1 = new JButton("Kuzey"); // Kuzey bölgesi için buton
    JButton btn2 = new JButton("Güney"); // Güney bölgesi için buton
    JButton btn3 = new JButton("Doğu");  // Doğu bölgesi için buton
    JButton btn4 = new JButton("Batı");  // Batı bölgesi için buton
    JButton btn5 = new JButton("Merkez"); // Merkez bölgesi için buton

    // Butonları BorderLayout bölgelerine ekle
        frame.add(btn1, BorderLayout.NORTH); // Kuzey bölgesine ekle buton 1'i
        frame.add(btn2, BorderLayout.SOUTH); // Güney bölgesine ekle
        frame.add(btn3, BorderLayout.EAST);   // Doğu bölgesine ekle
        frame.add(btn4, BorderLayout.WEST);   // Batı bölgesine ekle
        frame.add(btn5, BorderLayout.CENTER); // Merkez bölgesine ekle

    // Çerçeveyi görünür yap
        frame.setVisible(true);

    //                                      gridlayout örneği...

    JFrame frame2 = new JFrame("GridLayout Örneği");
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setSize(400, 300);

    // 3 satır 2 sütunluk GridLayout oluştur
    frame2.setLayout(new GridLayout(3, 2));

    // Butonları oluştur
    JButton button1 = new JButton("Buton 1");
    JButton button2 = new JButton("Buton 2");
    JButton button3 = new JButton("Buton 3");
    JButton button4 = new JButton("Buton 4");
    JButton button5 = new JButton("Buton 5");
    JButton button6 = new JButton("Buton 6");

    // Butonları ızgaraya ekle
    frame2.add(button1);
    frame2.add(button2);
    frame2.add(button3);
    frame2.add(button4);
    frame2.add(button5);
    frame2.add(button6);

    // Pencereyi görünür yap
    frame2.setVisible(true);

    //                                         flowLayout örneği...
    JFrame pencere = new JFrame("FlowLayout Örneği");
        pencere.setSize(400, 200);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // FlowLayout ayarlanıyor (varsayılan olarak ortalar)
    //new FlowLayout(FlowLayout.LEFT); // dersek sola yaslar mesela
        pencere.setLayout(new FlowLayout());

    // Butonlar oluşturuluyor
    JButton buton1 = new JButton("Buton 1");
    JButton buton2 = new JButton("Buton 2");
    JButton buton3 = new JButton("Buton 3");
    JButton buton4 = new JButton("Buton 4");

    // Butonlar pencereye ekleniyor
        pencere.add(buton1);
        pencere.add(buton2);
        pencere.add(buton3);
        pencere.add(buton4);

    // Pencere görünür hale getiriliyor
        pencere.setVisible(true);
}
