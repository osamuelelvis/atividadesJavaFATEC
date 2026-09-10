import javax.swing.JOptionPane;
public class LT01_ESTREP40 {
    public static void main (String args[]) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        
        for (int i = n1; i <= n2; i++) {
            if ((i % i == 0) && (i % 1 == 0)) {
                int divisores = 0;
                
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisores++;
                    }
                }
                if (divisores == 2) {
                    System.out.println("Número "+i+" é primo");
                }
            }
        }
    }
}
