import javax.swing.JOptionPane;
public class ATM_SATOSHI {
    public static void main (String args[]) {
	int valores[] = {2, 5, 10, 20, 50, 100};
	int qtd_notas[] = new int[6];
        int opc = 0;
        while (opc != 9) {
	    opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n 1 - Carregar Notas \n 2 - Retirar Notas \n 3 - Estatística \n 9 - Fim"));
            switch(opc) {
                case 1:
                    CarregarNotas(qtd_notas, valores);
                    break;
                case 2:
                    RetirarNotas(qtd_notas, valores);
                    break;
		case 3:
		    Estatistica();
              	    break;
		case 9:
	            JOptionPane.showMessageDialog(null,"FIM");
		    System.exit(0);
		default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    public static void CarregarNotas(int nt[], int vlrs[]) {
	for (int i = 0; i < 6; i++) {
		nt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas de "+vlrs[i]+" reais"));
	}
    }

    public static void RetirarNotas(int nt[], int vlrs[]) {
	int qtd;
    	int saque;
	int total = 0;
 	saque = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para saque"));
	for (int i = 0; i < 6; i++) {
	    total += nt[i] * vlrs[i];
	}
	if (saque > total) {
	    JOptionPane.showMessageDialog(null,"EXCEDEU O LIMITE DO CAIXA");
	    return;
	}

	for (int i = 5; i >= 0; i--) {
	    qtd = saque / vlrs[i];
	    if (qtd > nt[i]) {
		qtd = nt[i];
	    }
	    nt[i] = nt[i] - qtd;
	    saque = saque - qtd * vlrs[i];
	}
	
    }

    public static int Estatistica() {
    	return 0; 
    }
}