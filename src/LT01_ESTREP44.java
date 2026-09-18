/*Receber número da base; Receber número do expoente; Calcular potência; Mostrar valor potência*/
import javax.swing.JOptionPane;
public class LT01_ESTREP44 {
	public static void main (String args[]) {
                int potencia = 1;
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da base"));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do expoente"));
		for (int i = 1; i <= expoente; i++) {
                        potencia = potencia * base;
		}
		JOptionPane.showMessageDialog(null,"O valor da potência é igual a: "+potencia);
	}
}