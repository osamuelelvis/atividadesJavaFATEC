import javax.swing.JOptionPane;
public class FUNREC03 {
    public static void main (String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        double resultado = calcular(num);
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
    public static double calcular (int n) {
        if (n == 1) {
            return 1;
        }
        return (1.0 / n) + calcular(n-1);
    }
}
