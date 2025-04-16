import javax.swing.*;
//JComboBox yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde

public class JComboBox {
    JFrame f = new JFrame("örnek");
    String[] diller = {"Java","C++","Python","C#","Ruby","Swift"};
    JComboBox cb = new JComboBox(diller);
    cb.setBounds(50,50,90,20);
    JButton btn = new JButton("gönder");
    btn.setBounds(50,100,90,20);
    btn.addActionListener(new ActionListener()){
        public void actionPerformed(ActionEvent e){
            String data = "Programlama dili seçiminiz: "+cb.getItemAt(cb.getSelectedIndex());
            System.out.println(data);
        }
    }
    f.add(cb);
    f.add(btn);
    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
}
