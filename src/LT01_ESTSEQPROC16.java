import javax.swing.JOptionPane;
public class LT01_ESTSEQPROC16 {
    public static void main (String args[]) {
	int qtd_horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
	int vlr_hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora"));
	int desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto"));
	int descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes"));
	CalculaSalario(qtd_horas, vlr_hora, desconto, descendentes);
    }
    public static void CalculaSalario(int qtd_horas, int vlr_hora, int desconto, int descendentes) {
	double slr_liquido;
	double slr_bruto;
	slr_bruto = qtd_horas * vlr_hora;
	slr_liquido = slr_bruto - (slr_bruto * (desconto / 100.0)) + (descendentes * 100);
        JOptionPane.showMessageDialog(null,"O sálario bruto final será de: R$"+slr_liquido);
    }
}