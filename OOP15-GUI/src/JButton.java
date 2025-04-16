import javax.swing.*;
import java.awt.event.ActionListener;
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
// JButton ve butona tıklama olaylarına bakalım...
public class JButton {
    JFrame f = new JFrame("Buton örneği");
    JButton btn = new JButton();
    btn.SetText("gönder");
    btn.setBounds(100,100,100,30);

    btn.addActionListener(new ActionListener()){
        public void actionperformed(aactionEvent e){
            System.out.println("butona tıklandı");
        }
    }

    f.add(btn);
    f.setSize(400,400);
    f.setVisible(true);
}