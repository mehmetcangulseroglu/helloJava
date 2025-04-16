import javax.swing.*;
//JList yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde

public class JList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList with DefaultListModel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Java");
        listModel.addElement("Python");
        listModel.addElement("C++");
        listModel.addElement("C#");
        listModel.addElement("JavaScript");
        listModel.addElement("Ruby");
        listModel.addElement("PHP");
        listModel.addElement("Swift");
        listModel.addElement("Kotlin");
        listModel.addElement("Go");

        JList<String> list = new JList<>(listModel);
        list.setBounds(50, 50, 200, 150);

        frame.add(list);
        frame.setVisible(true);

}
