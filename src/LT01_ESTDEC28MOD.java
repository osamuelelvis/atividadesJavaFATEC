import javax.swing.JOptionPane;
public class LT01_ESTDEC28MOD {
    public static void main (String args[]) {
	int preco_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço atual do produto"));
	int media_mensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a média mensal do produto"));
	NovoPreco(preco_atual, media_mensal);
    }
    static void NovoPreco(int preco_atual, int media_mensal) {
	int novo_preco;
	if (media_mensal < 500 && preco_atual < 30) {
	    novo_preco = (int) (preco_atual + (preco_atual * 0.10));
	} else {
	    if ((media_mensal >= 500 && media_mensal < 1000) && (preco_atual >= 30 && preco_atual < 80)) {
		novo_preco = (int) (preco_atual + (preco_atual * 0.15));
	    } else {
		if (media_mensal >= 1000 && preco_atual >= 80) {
		    novo_preco = (int) (preco_atual + (preco_atual * 0.95));
		} else {
                    novo_preco = preco_atual;
                }
	    }
	}
        JOptionPane.showMessageDialog(null,"Novo preço do produto: R$"+novo_preco);
    }
}