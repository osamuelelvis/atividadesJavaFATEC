import java.util.Arrays;
import javax.swing.JOptionPane;
public class LT02_VARHOMO6 {
    public static void main (String args[]) {
	int vetor[] = new int[20];
	for (int i = 0; i < 20; i++) {
	    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
	}
	Arrays.sort(vetor);
	System.out.print("Valores: "+Arrays.toString(vetor));
    }
}