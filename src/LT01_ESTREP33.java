import javax.swing.JOptionPane;
public class LT01_ESTREP33 {
    public static void main (String args[]) {
        int i, num;
        double soma = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (i = 1; i <= num; i++) {
            soma = soma + (1.0 / i);
            System.out.println("O valor da soma é "+soma+"; O valor de i é igual a "+i);
        }
        JOptionPane.showMessageDialog(null,"O resultado da série é igual a: "+soma);
    }
}
