import javax.swing.JOptionPane;
public class LT01_ESTDEC19 {
    public static void main (String args[]) {
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro número real"));
        System.out.println("Número 1: "+n1);
        System.out.println("Número 2: "+n2);
        if (n1 > n2) {
            System.out.println("O maior número é "+n1);
        } else {
            System.out.println("O maior número é "+n2);
        }
    }
}
