import javax.swing.*;
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JLabel {
    //JLabel yapısına bakalım JLabel yazı anlamına gelir framedeki yazıları ifade eder diyebiliriz...
    JFrame f1 = new JFrame("Label Örneği");
    JLabel l1 = new JLabel();
    l1.setText("yazı kısmı");
    l1.setBounds(100,50,100,30);
    f1.add(l1);

    JButton btn = new JButton("değiştir");
    btn.setBounds(100,100,100,30);
    f1.add(btn);

    btn.addActionListener(new ActionListener()){
        public void actionperformed(aactionEvent eJ){
            l1.setText("butona tıklandı");
        }
    }


    f1.setSize(400,400);
    f1.setVisible(true);

}
