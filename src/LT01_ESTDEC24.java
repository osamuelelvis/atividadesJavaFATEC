import javax.swing.JOptionPane;
public class LT01_ESTDEC24 {
    public static void main (String args[]) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        if (((valor % 2) == 0) && (valor % 3) == 0) {
            JOptionPane.showMessageDialog(null,"Este valor é divisível por 2 e 3.");
        } else {
            if ((valor % 2) == 0) {
                JOptionPane.showMessageDialog(null,"Este valor é divisível apenas por 2.");
            } else {
                if ((valor % 3) == 0) {
                    JOptionPane.showMessageDialog(null,"Este valor é divisível apenas por 3.");
                } else {
                    JOptionPane.showMessageDialog(null,"O número não é divisível por 2 nem por 3.");
                }
            }
        }
    }
}