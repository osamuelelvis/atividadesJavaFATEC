import javax.swing.JOptionPane;
public class LT01_ESTDEC18 {
    public static void main (String args[]) {
        int n1, n2, dif;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro nº 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro nº 2"));
        if (n1 > n2) {
            dif = n1 - n2;
            JOptionPane.showMessageDialog(null,"A diferença entre "+n1+" e "+n2+" é igual a: "+dif);
        } else {
            dif = n2 - n1;
            JOptionPane.showMessageDialog(null,"A diferença entre "+n2+" e "+n1+" é igual a: "+dif);
        }
    }
}
