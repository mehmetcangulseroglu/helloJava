import javax.swing.*;

//JTabbedPane yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JTabbedPane {
    JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

    // JTabbedPane oluştur
    JTabbedPane tabbedPane = new JTabbedPane();

    // Paneller oluştur
    JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Bu, birinci sekme içeriğidir."));

    JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Bu, ikinci sekme içeriğidir."));

    JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Bu, üçüncü sekme içeriğidir."));

    // Sekmelere panelleri ekle
        tabbedPane.addTab("Sekme 1", panel1);
        tabbedPane.addTab("Sekme 2", panel2);
        tabbedPane.addTab("Sekme 3", panel3);

    // JTabbedPane'i çerçeveye ekle
        frame.add(tabbedPane);
        frame.setVisible(true);
}
