import javax.swing.JOptionPane;
public class FUNREC04 {
    public static void main (String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        double resultado = calcular(num, 1);
        JOptionPane.showMessageDialog(null,"Resultado = "+resultado);
    }
    public static double calcular (int n, int denominador) {
        if (n == 1) {
            return 1.0 / denominador;
        }
        return (double) n / denominador + calcular(n - 1, denominador + 1);
    }
}
