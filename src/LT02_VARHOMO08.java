import javax.swing.JOptionPane;
public class LT02_VARHOMO08 {
    public static void main (String args[]) {
	int matriz[][] = new int[4][3];
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 4; j++) {
		matriz[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos "+(i+1)+" vendidos na semana "+(j+1)));
	    }
	}
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 4; j++) {
                soma = soma + matriz[j][i];
            }
            System.out.println("Produto "+(i+1)+" vendeu "+soma+" unidades no mês");
        }
        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma = soma + matriz[i][j];
            }
            System.out.println("Na semana "+(i+1)+" foram vendidos "+soma+" produtos");
        }
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                soma = soma + matriz[j][i];
            }
        }
        JOptionPane.showMessageDialog(null,"Foram vendidos "+soma+" produtos no mês");
    }
}