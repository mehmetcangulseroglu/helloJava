import javax.swing.*;
//JMenu yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JMenu {
    JFrame frame = new JFrame("JMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

    // Menü çubuğu oluştur****
    JMenuBar menuBar = new JMenuBar();

    // Menü oluştur*****
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    // Menü öğeleri oluştur****
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    // Menü öğelerini menüye ekle****
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Ayırıcı çizgi ekle
        fileMenu.add(exitItem);

    // Menüleri menü çubuğuna ekle
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

    // Menü çubuğunu çerçeveye ekle
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
}
