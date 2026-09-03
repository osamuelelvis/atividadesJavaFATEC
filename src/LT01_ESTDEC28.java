import javax.swing.JOptionPane;
public class LT01_ESTDEC28 {
    public static void main (String args[]) {
        double preco_atual, media_mensal, preco_novo;
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto"));
        media_mensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto"));
        if (media_mensal < 500 && preco_atual < 30) {
            preco_novo = preco_atual * 1.10;
        } else {
            if ((media_mensal >= 500 && media_mensal < 1000) && (preco_atual >= 30 && preco_atual < 80)) {
            preco_novo = preco_atual * 1.15;
        } else {
                if (media_mensal >= 1000 && preco_atual >= 80) {
                    preco_novo = preco_atual * 0.95;
                } else {
                    preco_novo = preco_atual;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"O novo preço do produto é: "+preco_novo);
    }
}
