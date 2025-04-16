import javax.swing.*;

//JCheckBox yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JCheckBox {
    JFrame f = new JFrame("checbox örneği");
    JCheckbox ch1 = new JCheckbox("evet");
    JCheckbox ch1 = new JCheckbox("hayır");
    ch1.setBounds(100,100,250,50);
    ch2.setBounds(150,150,250,50);

    JButton btn = new JButton("kontrol");
    btn.addActionListener(new ActionListener()){
        public void actionPerformed(ActionEvent e){
            if(ch1.isSelected()){
                System.out.println("evet seçildi");
            }
            if(ch2.isSelected()){
                System.out.println("hayır seçildi");
            }
        }
        f.add(ch1);
        f.add(ch2);
        f.add(btn);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
