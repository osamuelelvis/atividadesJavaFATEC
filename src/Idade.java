import javax.swing.JOptionPane;

public class Idade {
    public static void main (String args [ ] ) {
    int num1, num2;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira idade: "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda idade: "));
    JOptionPane.showMessageDialog(null,"Maria tem " + num1 + " anos e João tem " + num2 + " anos");
    }
}