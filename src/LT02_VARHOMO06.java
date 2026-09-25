import java.util.Arrays;
import javax.swing.JOptionPane;
public class LT02_VARHOMO06 {
    public static void main (String args[]) {
	int vetor[] = new int[5];
	for (int i = 0; i < 5; i++) {
	    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
	}
        bubbleSort(vetor);
        JOptionPane.showMessageDialog(null,"Vetor ordenado: "+Arrays.toString(vetor));
    }
    public static int[] bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] < v[j]) {
                    int aux;
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        return v;
    }
}
