import javax.swing.JOptionPane;
public class LT01_ESTSEQPROC17 {
    public static void main (String args[]) {
	int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo gasto na viagem"));
	float vel_media = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média"));
	CalculaQuantidadeLitros(tempo, vel_media);
    }
    public static void CalculaQuantidadeLitros (int tempo, float vel_media) {
	int qtd_litros;
	qtd_litros = (int) ((double) (vel_media * tempo) / 12);
	JOptionPane.showMessageDialog(null,"A quantidade de litros gasta foi de: "+qtd_litros);
    }
}