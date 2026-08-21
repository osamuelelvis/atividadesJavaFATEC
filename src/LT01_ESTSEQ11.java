import javax.swing.JOptionPane;
public class LT01_ESTSEQ11 {
    public static void main (String args[]) {
        float raio, comprimento, pi;
        pi = (float) 3.14;
        raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio da circunferência"));
        comprimento = (float) 2 * pi * raio;
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é igual a: " + comprimento);
    }
}
