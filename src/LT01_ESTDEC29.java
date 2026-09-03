import javax.swing.JOptionPane;
public class LT01_ESTDEC29 {
    public static void main (String args[]) {
        int opcao = 0;
        double valor_investido, valor_final = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Bem vindo! Digite 1 para poupança ou digite 2 para renda fixa."));
        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null,"Opção escolhida: poupança");
                valor_investido = Double.parseDouble(JOptionPane.showInputDialog("Quanto será investido?"));
                valor_final = valor_investido * 1.03 * 1;
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Opção escolhida: renda fixa");
                valor_investido = Double.parseDouble(JOptionPane.showInputDialog("Quanto será investido?"));
                valor_final = valor_investido * 1.05 * 1;
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        JOptionPane.showMessageDialog(null,"Após 30 dias, o valor final do investimento será de: R$"+valor_final);
    }
}
