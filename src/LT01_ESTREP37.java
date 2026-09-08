import javax.swing.JOptionPane;
public class LT01_ESTREP37 {
    public static void main (String args[]) {
        int n, a = 0, b = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série de Fibonacci"));
        System.out.println("Fibonacci até o "+n+"º termo;");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
