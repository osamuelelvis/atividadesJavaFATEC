import javax.swing.JOptionPane;
public class LT01_ESTSEQ09 {
    public static void main (String args[]) {
        int n1, n2, soma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        soma = (n1 * n1) + (n2 * n2);
        JOptionPane.showMessageDialog(null, "A soma dos quadrados é igual a: " + soma);
    }
}
