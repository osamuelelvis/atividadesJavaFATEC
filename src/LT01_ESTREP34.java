import javax.swing.JOptionPane;
public class LT01_ESTREP34 {
    public static void main (String args[]) {
        int num, res, i;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (i = 1; i <= 10; i++) {
            res = (num * i);
            System.out.println(num+" x "+i+" = "+res);
    }
}
}