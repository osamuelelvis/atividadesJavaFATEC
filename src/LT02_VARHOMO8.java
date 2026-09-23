import javax.swing.JOptionPane;
public class LT02_VARHOMO8 {
    public static void main (String args[]) {
	int matriz[][] = new int[4][3];
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 3; j++) {
		matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos"));
	    }
	}
    }
}