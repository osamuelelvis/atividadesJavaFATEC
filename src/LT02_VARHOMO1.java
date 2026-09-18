/*Criar vetor; Coletar vetor; Calcular média dos valores entre 10 e 200 e soma dos ímpares; Exibir resultados*/
import javax.swing.JOptionPane;
public class LT02_VARHOMO1 {
    public static void main (String args[]) {
	int opc = 0;
	int vetor[] = new int[5];
	opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Calcular média dos valores entre 10 e 200 \n 2 - Calcular soma dos ímpares \n 3 - Exibir resultados \n 9 - Sair"));
	while (opc != 9) {
            switch (opc) {
		case 1:
                    CalcularMedia(vetor);
                    break;
		case 2:
                    CalcularImpares(vetor);
                    break;
		case 3:
                    ExibeResultados(vetor);
                    break;
		case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
		default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!");
            }
        }		
    }
    public static double CalcularMedia(int vt[]) {
        double media;
        int soma = 0;
        for (int x = 0; x < 5; x++) {
            vt[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            System.out.println(x);
            if (vt[x] > 10 && vt[x] < 200) {
                soma = soma + vt[x];
            }
        }
	return media = soma / 50;
    }
    
	public static int CalcularImpares(int vt[]) {
		int soma_impares = 0;
		for (int i = 0; i < 5; i++) {
			if (vt [i] % 1 == 0) {
				soma_impares = soma_impares + vt[i];
			}
		}
            return soma_impares;
	}
	public static int ExibeResultados(int vt[]) {
		return 0;
	}
}