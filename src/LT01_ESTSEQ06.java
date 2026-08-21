import javax.swing.JOptionPane;
public class LT01_ESTSEQ06 {
    public static void main (String args[]) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor X"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor Y"));
        c = a;
        a = b;
        b = c;
        JOptionPane.showMessageDialog(null, "Valores após a troca: \nX: " + a + "\nY: " + b);
    }
}
