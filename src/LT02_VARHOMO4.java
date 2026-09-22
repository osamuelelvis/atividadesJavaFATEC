import javax.swing.JOptionPane;
public class LT02_VARHOMO4 {
    public static void main (String args[]) {
	double vetor[] = new double[30];
	double media;
	int qtd_acima = 0;
	double soma = 0;
	for (int i = 0; i < 5; i++) {
	    vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
	    soma = soma + vetor[i];
	}
	media = soma / 5.0;
	for (int j = 0; j < 5; j++) {
	    if (vetor[j] > media) {
		qtd_acima = qtd_acima + 1;
	    }
	}
	System.out.println("Média do grupo: "+media+"\nQuantidade de notas acima da média: "+qtd_acima);
	System.out.print("Posições das notas abaixo da média: ");
	for (int k = 0; k < 5; k++) {
	    if (vetor[k] < media) {
		System.out.print(k+" ");
	    }
	}
    }
}