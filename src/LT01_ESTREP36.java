import javax.swing.JOptionPane;
public class LT01_ESTREP36 {
    public static void main (String args[]) {
        int fat = 1;
        double divisao = 0.0;
        double serie = 0.0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (int i = 1; i <= num; i++) {
            fat = fat * i;
            divisao = 1.0 / fat;
            serie = serie + divisao;
            System.out.println(serie);
        }
        JOptionPane.showMessageDialog(null,"O resultado da série é igual a: "+serie);
    }
}
