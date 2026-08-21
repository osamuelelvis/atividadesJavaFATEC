import javax.swing.JOptionPane;
public class LT01_ESTSEQ02 {
    public static void main (String args[]) {
        float salario_atual, salario_novo;
        salario_atual = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário atual"));
        salario_novo = (float) (salario_atual * 1.15);
        JOptionPane.showMessageDialog(null,"O salário novo após o reajuste será de R$" + salario_novo);
    }
}
