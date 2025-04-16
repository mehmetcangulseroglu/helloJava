//JPopupMenu yapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde
public class JPopupMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        // JPopupMenu oluştur
        JPopupMenu popupMenu = new JPopupMenu();

        // Menü öğeleri oluştur
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Menü öğelerini popup menüye ekle
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Fare sağ tıklandığında popup menüyü göster
        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());//popupMenu.show(frame, evt.getX(), evt.getY()); normalde ilk parametreye frame adı yazılır ikisi aynı kullanım
                }//x ve y koordinatları ile menüyü açar yani koordinatları temsil eder. x koordinatı y koordinatı vs...
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });

        frame.setVisible(true);

}
