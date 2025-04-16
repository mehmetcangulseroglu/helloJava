import javax.swing.*;
//JTableyapısına bakalım...
//KODLARI DİĞER SINIFLARDAN BAĞIMSIZ ÇALIŞTIRINIZ...ve main içinde

public class JTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        String[][] data = {//çok boyutlu dizi
            {"Java", "1.8"},//çok boyutlu dizide satırları ifade eder
            {"Python", "3.8"},
            {"C++", "11"},
            {"C#", "8"},
            {"JavaScript", "ES6"},
            {"Ruby", "2.7"},
            {"PHP", "7.4"},
            {"Swift", "5.3"},
            {"Kotlin", "1.4"},
            {"Go", "1.15"}
        };
        String[] column = {"Diller", "Versiyonlar"};//tek boyutlu dizide de sutunları tutuyoruz
        JTable table = new JTable(data, column);
        table.setBounds(50, 50, 200, 150);

        frame.add(table);
        frame.setVisible(true);

}
