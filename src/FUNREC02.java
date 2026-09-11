import javax.swing.JOptionPane;
public class FUNREC02 {
    public static int calcular(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calcular(n - 1);
    }
    public static void main (String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        /* calcular(num); */
        System.out.println(calcular(num));
    }
}
