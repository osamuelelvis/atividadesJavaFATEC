/*Criar vetor de 100 posições; Coletar vetor; Exibir maior e menor valor e média dos valores*/
import javax.swing.JOptionPane;
public class LT02_VARHOMO2 {
    public static void main (String args[]) {
    	int vetor[] = new int[50];
	int maior;
	int menor;
	int soma;
	double media;
	vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o número"));
	soma = vetor[0];
	maior = vetor[0];
	menor = vetor[0];
	for (int i = 1; i < 5; i++) {
	    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"o número"));
	    if (vetor[i] > maior) {
	        maior = vetor[i];
	    }
	    if (vetor[i] < menor) {
	    	menor = vetor[i];
	    }
	    soma = soma + vetor[i];
	}
	media = soma / 5.0;
	JOptionPane.showMessageDialog(null,"Maior: "+maior+"\n Menor: "+menor+"\n Média: "+media);
    }
}
