import javax.swing.JOptionPane;
public class LT01_ESTDEC26 {
    public static void main (String args[]) {
        int n1, n2, maior, menor, resultado;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        if (n1 > n2) {
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }
        resultado = maior % menor;
        JOptionPane.showMessageDialog(null,"O resto da divisão é: "+resultado);
        if (maior % menor == 0) {
            JOptionPane.showMessageDialog(null,"O número "+maior+" é múltiplo de "+menor);
        } else {
            JOptionPane.showMessageDialog(null,"O número "+maior+" não é múltiplo de "+menor);
        }
    }
}
