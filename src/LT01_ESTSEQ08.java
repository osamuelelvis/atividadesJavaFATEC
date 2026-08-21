import javax.swing.JOptionPane;
public class LT01_ESTSEQ08 {
    public static void main (String args[]){
        float deposito, investimento;
        deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de depósito"));
        investimento = (float) (deposito * 1.013 * 1);
        JOptionPane.showMessageDialog(null, "Após 1 mês de aplicação: R$" + investimento);
    }
}
