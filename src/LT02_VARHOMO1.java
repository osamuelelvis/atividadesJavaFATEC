/*Criar vetor; Coletar vetor; Calcular média dos valores entre 10 e 200 e soma dos ímpares; Exibir resultados*/
import javax.swing.JOptionPane;
public class LT02_VARHOMO1 {
    public static void main (String args[]) {
	int opc = 0;
	int vetor[] = new int[5];
        double media = 0;
        int soma_impares = 0;
        for (int i = 0; i < 50; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(i+1)+"º valor"));
        }
	while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Calcular média dos valores entre 10 e 200 \n 2 - Calcular soma dos ímpares \n 3 - Exibir resultados \n 9 - Sair"));
            switch (opc) {
		case 1:
                    media = CalcularMedia(vetor);
                    JOptionPane.showMessageDialog( null, "Média calculada!" );
                    break;
		case 2:
                    soma_impares = CalcularImpares(vetor);
                    JOptionPane.showMessageDialog( null, "Soma dos ímpares calculada!" );
                    break;
		case 3:
                    ExibeResultados(media, soma_impares);
                    break;
		case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
		default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!");
            }
        }		
    }
    public static double CalcularMedia(int vt[]) {
        int soma = 0;
        int cont = 0;
        for (int x = 0; x < 50; x++) {
            if (vt[x] > 10 && vt[x] < 200) {
                soma = soma + vt[x];
                cont++;
            }
        }
        if (cont > 0) { 
            return (double) soma / cont; 
        } else { 
            return 0; 
        }
    }
    
	public static int CalcularImpares(int vt[]) {
		int soma_impares = 0;
		for (int i = 0; i < 50; i++) {
			if (vt [i] % 2 != 0) {
				soma_impares = soma_impares + vt[i];
			}
		}
            return soma_impares;
	}
	public static int ExibeResultados(double media, int soma_impares) {
            JOptionPane.showMessageDialog(null, "Média dos valores entre 10 e 200: " + media + "\nSoma dos números ímpares: " + soma_impares);
            return 0;
	}
}