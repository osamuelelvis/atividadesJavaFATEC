import javax.swing.JOptionPane;
public class Estudo {
    public static void main (String args[]) {
	int opc = 0;
	int vetor[] = new int[4];
	do {
	    opc = Integer.parseInt(JOptionPane.showInputDialog("TESTE MENU \n 1 - Carregar Vetor \n 2 - Ordenar vetor \n 3 - Exibir Resultados \n 9 - Sair"));
	    switch(opc) {
		case 1:
		    CarregaVetor(vetor);
		    break;
		case 2:
		    OrdenaVetor(vetor);
                    JOptionPane.showMessageDialog(null,"Vetor ordenado");
		    break;
		case 3:
		    ExibirResultados(vetor);
		    break;
		case 9:
		    JOptionPane.showMessageDialog(null,"FIM");
		    break;
		default:
		    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
		    break;
	    } 
	} while (opc != 9);
    }
    static void CarregaVetor(int[] vet) {
	for (int i = 0; i < 4; i++) {
	    vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	}
    }
    static void OrdenaVetor(int[] vet) {
	for (int i = 0; i < vet.length - 1; i++) {
	    for (int j = 0; j < vet.length - 1; j++) {
		if (vet[j] > vet[j+1]) {
		    int aux = vet[j];
		    vet[j] = vet [j+1];
		    vet[j+1] = aux;
		}
	    }
	}
    }

    static void ExibirResultados(int[] vet) {
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(vet[i]);
        }
    }
}