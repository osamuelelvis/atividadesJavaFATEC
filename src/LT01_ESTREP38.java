import javax.swing.JOptionPane;
public class LT01_ESTREP38 {
    public static void main (String args[]) {
        int n, maior, menor;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        maior = n;
        menor = n;
        for (int i = 2; i <= 5; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+i+"º número"));
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        JOptionPane.showMessageDialog(null,"Maior valor: "+maior+"\nMenor valor: "+menor);
    }
}
