import javax.swing.JOptionPane;
import java.io.IOException;
public class SimuladoN2 {
    public static void main(String[] args) throws IOException {
        Produto[] produto = new Produto[198745];
        Produto[] vitrine = new Produto[25];
        Metodos m = new Metodos();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n 1 - Carga dos Produtos \n 2 - Consulta de Produto \n 3 - Grava 25 da Vitrine \n 9 - Sair"));
            switch(opc) {
                case 1:
                    produto = m.FCargaProdutos(produto);
                    break;
                case 2:
                    int codigoDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto"));
                    String resultado;
                    resultado = m.FConsultaProduto(produto, codigoDigitado, 0);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case 3:
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"PROGRAMA FINALIZADO");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção deve ser 1, 2, 3 ou 9");
                    break;
            }
        }
    }
}
