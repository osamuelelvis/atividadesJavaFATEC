import javax.swing.JOptionPane;
public class LT01_ESTDEC29MENU {
    public static void main(String[] args) {
        int opc = 0;
	double vlr_invest;
	while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n 1 - Investir na Poupança \n 2 - Investir em Renda Fixa \n 9 - Encerrar"));
            switch(opc) {
                case 1:
                    vlr_invest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
                    Poupanca(vlr_invest);
                    break;
		case 2:
                    vlr_invest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
                    RendaFixa(vlr_invest);
                    break;
		case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    break;
		default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
            }
	}
    } /*fim da main*/
    static void Poupanca(double vlr_invest) {
	double juros;
	double total;
	juros = vlr_invest * 0.03 * 1;
	total = juros + vlr_invest;
	JOptionPane.showMessageDialog(null,"Após 1 mês, o valor total será de: R$"+total);
    }
    static void RendaFixa(double vlr_invest) {
        double juros;
	double total;
	juros = vlr_invest * 0.05 * 1;
	total = juros + vlr_invest;
	JOptionPane.showMessageDialog(null,"Após 1 mês, o valor total será de: R$"+total);
    }
} 