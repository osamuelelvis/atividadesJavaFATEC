import javax.swing.JOptionPane;
public class LT01_ESTDEC23 {
    public static void main (String args []) {
        int a, b, c, d;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor"));
        if (d > b) {
            if (d > c) {
                JOptionPane.showMessageDialog(null,"Ordem dos números: "+a+", "+b+", "+c+", "+d);
            } else {
                JOptionPane.showMessageDialog(null,"Ordem dos números: "+a+", "+b+", "+d+", "+c);
            }
        } else {
            if (a > d) {
                JOptionPane.showMessageDialog(null,"Ordem dos números: "+d+", "+a+", "+b+", "+c);
            } else {
                JOptionPane.showMessageDialog(null,"Ordem dos números: "+a+", "+d+", "+b+", "+c);
            }
        }
    }
}
