import javax.swing.JOptionPane;
public class LT01_ESTDEC20 {
    public static void main (String args[]) {
        int a, b, c;
        double x1, x2, delta;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
        delta = Math.pow(b,2) - (4 * a * c);
        if (delta > 0) {
            JOptionPane.showMessageDialog(null,"Existem duas raízes reais e diferentes.");
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null,"X1: "+x1+"\nX2: "+x2);
        } else {
            if (delta == 0) {
                JOptionPane.showMessageDialog(null,"Existe apenas uma raíz real.");
            }
            else {
                JOptionPane.showMessageDialog(null,"Não existem raízes reais.");
            }
        }
    }
}
