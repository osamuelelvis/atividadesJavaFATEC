import javax.swing.JOptionPane;
public class LT01_ESTDEC28 {
    public static void main (String args[]) {
	int preco_atual = Integer.parseInteger(JOptionPane.showInputDialog("Digite o preço atual do produto"));
	int media_mensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a média mensal do produto"));
	NovoPreco(preco_atual, media_mensal);
    }
    static void NovoPreco(int preco_atual, int media mensal) {
	int novo_preco;
	if (media_mensal < 500 && preco_atual < 30) {
	    novo_preco = preco_atual + (preco_atual * 0.10);
	} else {
	    if ((media_mensal >= 500 && media_mensal < 1000) && (preco_atual >= 30 && preco_atual < 80)) {
		novo_preco = preco_atual + (preco_atual * 0.15);
	    } else {
		if (media_mensal >= 1000 and preco_atual >= 80) {
		    novo_preco = preco_atual + (preco_atual * 0.95);
		}
	    }
	}
    }
}