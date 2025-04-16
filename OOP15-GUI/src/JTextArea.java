//JTextArea kullanımına bakalım...
//daha büyük metin kutuları denebilir...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde

public class JTextArea {
    JFrame f = new JFrame("TextArea örneği");
    JLabel l1,l2;
    JTextArea area;
    JButton btn;

    l1 = new JLabel();
    l1.setBounds(50,25,100,30);;

    l2 = new JLabel();
    l2.setBounds(160,25,100,30);

    area = new JTextArea();
    area.setBounds(20,75,250,200);

    btn = new JButton("hesapla");
    btn.setBounds(100,300,120,30);

    btn.addActionListener(new ActionListener()){
        public void actionPerformed(ActionEvent arg0){
            String text = area.getText();
            String words[] = text.split("\\s");
            l1.setText("kelime : "+words.length);
            l2.setText("karakter : "+text.length());
        }
    }

    f.add(l1);
    f.add(l2);
    f.add(area);
    f.add(btn);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}
