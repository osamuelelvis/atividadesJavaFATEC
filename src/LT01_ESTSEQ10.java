import javax.swing.JOptionPane;
public class LT01_ESTSEQ10 {
    public static void main (String args[]) {
        float n1, n2, diferenca;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
        diferenca = n1 - n2;
        JOptionPane.showMessageDialog(null, "A diferença dos valores é de " + diferenca);
    }
}
