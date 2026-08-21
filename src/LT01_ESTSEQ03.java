import javax.swing.JOptionPane;
public class LT01_ESTSEQ03 {
    public static void main (String args []) {
        float base, altura, area;
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null,"A área do triângulo é igual a: " + area);
    }
}