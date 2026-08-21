import javax.swing.JOptionPane;
public class LT01_ESTSEQ14 {
    public static void main(String args[]) {
        int ang1, ang2, ang3;
        ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo"));
        ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ângulo"));
        ang3 = 180 - (ang1 + ang2);
        JOptionPane.showMessageDialog(null,"O valor do terceiro ângulo é de " + ang3 + "°.");
    }
}
