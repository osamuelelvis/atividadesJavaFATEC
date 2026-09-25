/*Criar vetor; Coletar vetor; Calcular média dos valores entre 10 e 200 e soma dos ímpares; Exibir resultados*/
import javax.swing.JOptionPane;
public class LT02_VARHOMO01 {
    public static void main(String args[]) {
        int vetor[] = new int[50];
        int soma = 0;
        int cont = 0;
        int soma_impares = 0;
        double media = 0;

        for (int i = 0; i < 50; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i + 1)+"º valor"));
        }

        for (int i = 0; i < 50; i++) {
            if (vetor[i] >= 10 && vetor[i] <= 200) {
                soma = soma + vetor[i];
                cont++;
            }
            if (vetor[i] % 2 != 0) {
                soma_impares = soma_impares + vetor[i];
            }
        }

        if (cont > 0) {
            media = (double) soma / cont;
        }

        JOptionPane.showMessageDialog(null, "Média dos valores entre 10 e 200: " + media
                + "\nSoma dos números ímpares: " + soma_impares);
    }
}