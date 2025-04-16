//JPasswordField kullanımına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
//şifre alanlarını ifade eder şifre girildiğinde girilenleri göstermez...
public class JPasswordField {
    JFrame f = new JFrame("PasswordField örneği");
    JLabel l1 = new JLabel("şifre :");
    l1.setBounds(20,20,100,30);

    JPasswordField pass = new JPasswordField();
    pass.setBounds(20,50,100,30);

    JButton btn = new JButton("gönder");
    btn.setBounds(20,80,100,30);

    btn.addActionListener(new ActionListener()){
        public void actionPerformed(ActionEvent arg0){
            String password = new String(pass.getPassword());
            l1.setText(l1.getText()+password);
        }
    }
    f.add(l1);
    f.add(pass);
    f.add(btn);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

}
