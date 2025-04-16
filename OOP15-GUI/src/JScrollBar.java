//JScrollBar yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde

import javax.swing.*;

public class JScrollBar {
    JFrame frame = new JFrame("JScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

    JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(50, 50, 200, 20);
        scrollBar.setOrientation(JScrollBar.HORIZONTAL); // Kaydırma çubuğunu yatay olarak ayarlar
        //dikey olsun isteseydik VERTICAL derdik
        frame.add(scrollBar);
        frame.setVisible(true);
}
