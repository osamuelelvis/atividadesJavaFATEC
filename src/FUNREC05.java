import javax.swing.JOptionPane;
public class FUNREC05 {
    public static void main (String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        double resultado = calcular (num);
        JOptionPane.showMessageDialog(null,"Resultado da série = "+resultado);
    }
    public static double fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fatorial (n - 1);
    }
    public static double calcular(int n) {
        if (n == 1) {
            return 1;
        }
        return fatorial(n) + calcular(n - 1);
    }
}
