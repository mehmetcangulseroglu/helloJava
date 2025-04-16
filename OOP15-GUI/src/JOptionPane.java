//JOptionPane yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
//nesne üretilmeden çağıralabilir.
public class JOptionPane {
    // Bilgi mesajı göster
        JOptionPane.showMessageDialog(null, "Bu bir bilgi mesajıdır.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);//aslında null üzerinde varsa hangi framede göstereceksen mesajı onun adını yazarız
        //informaiton message kısmı mesajın yanına bilgi simgesi verir
    // Uyarı mesajı göster
        JOptionPane.showMessageDialog(null, "Bu bir uyarı mesajıdır.", "Uyarı", JOptionPane.WARNING_MESSAGE);//warning message kısmı mesajın yanına uyarı simgesi verir

    // Giriş diyaloğu göster ve kullanıcıdan veri al
    String input = JOptionPane.showInputDialog(null, "Adınızı girin:", "Giriş", JOptionPane.QUESTION_MESSAGE);

    // Kullanıcıdan alınan veriyi bilgi mesajı olarak göster
        JOptionPane.showMessageDialog(null, "Merhaba, " + input + "!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
}
