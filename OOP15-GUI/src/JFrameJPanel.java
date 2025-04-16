import javax.swing.*;
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
//JFrame ve JPanel yapılarına bakalım

public class JFrameJPanel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        JPanel panel = new JPanel();
        JButton button = new JButton("BUTON");
        frame.add(panel);
        panel.add(button);


        frame.setVisible(true);

    }
}
