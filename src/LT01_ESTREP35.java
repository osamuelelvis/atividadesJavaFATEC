import javax.swing.JOptionPane;
public class LT01_ESTREP35 {
    public static void main (String args[]) {
        int n1, n2, somatoria_impares = 0, i;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        if (n1 > n2) {
            for (i = n2; i <= n1; i++) {
                if (i % 2 != 0) {
                    somatoria_impares = somatoria_impares + i;
                }
            }
        } else {
            for (i = n1; i <= n2; i++) {
                if (i % 2 != 0) {
                    somatoria_impares = somatoria_impares + i;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"A soma dos números ímpares entre "+n1+" e "+n2+" é igual a "+somatoria_impares);
    }
}
