import javax.swing.JOptionPane;
public class LT01_ESTSEQ12 {
    public static void main (String args[]) {
        int ano_atual, ano_nascimento, idade_atual, idade_futuro;
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
        idade_atual = ano_atual - ano_nascimento;
        JOptionPane.showMessageDialog(null,"Sua idade atual é de " + idade_atual + " anos.");
        idade_futuro = idade_atual + 17;
        JOptionPane.showMessageDialog(null,"Daqui 17 anos, você terá " + idade_futuro + " anos.");
    }
}
