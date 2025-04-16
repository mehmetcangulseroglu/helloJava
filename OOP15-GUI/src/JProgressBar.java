import javax.swing.*;

//JProgressBar yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JProgressBar {
    JFrame frame = new JFrame("JProgressBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

    // JProgressBar oluştur
    JProgressBar progressBar = new JProgressBar(0, 100); // Minimum 0, maksimum 100
        progressBar.setBounds(50, 50, 300, 30);
        progressBar.setValue(50); // Başlangıç değeri = setValue();
        progressBar.setStringPainted(true); // Yüzdeyi göster

        frame.add(progressBar);
        frame.setVisible(true);

    int progress = 0;
        while (progress <= 100) {
        progressBar.setValue(progress); // progress bar çubuğunu güncelle
        try {
            Thread.sleep(50); // Her güncelleme arasında 50 ms bekle // kodu yavaşlatmak amaçlı thread koyduk
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        progress++;
    }
}
