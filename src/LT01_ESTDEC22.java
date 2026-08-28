import javax.swing.JOptionPane;
public class LT01_ESTDEC22 {
    public static void main (String args[]) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro"));
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null,"Valores em ordem crescente: "+n2+", "+n1);
        } else {
            JOptionPane.showMessageDialog(null,"Valores em ordem crescente: "+n1+", "+n2);
        }
    }
}
