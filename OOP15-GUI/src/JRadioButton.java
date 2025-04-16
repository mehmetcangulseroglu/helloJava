import javax.swing.*;
//JRadioButton yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JRadioButton {
    JFrame f = new JFrame("örnek");
    JRadioButton r1 = new JRadioButton("erkek");
    r1.setBounds(100,50,100,30);
    JRadioButton r2 = new JRadioButton("kadın");
    r2.setBounds(100,100,100,30);
    JRadioButton r3 = new JRadioButton("istemiyorum");
    r3.setBounds(100,150,100,30);

    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);

    JButton btn = new JButton("gönder");
    btn.setBounds(100,200,100,30);
    btn.addActionListener(new ActionListener()){
        public void actionPerformed(ActionEvent e){
            System.out.println(bg.getSelection);
        }
    }
    f.add(r1);
    f.add(r2);
    f.add(r3);
    f.add(btn);
    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
}
