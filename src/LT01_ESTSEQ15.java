import javax.swing.JOptionPane;
public class LT01_ESTSEQ15 {
    public static void main (String args[]){
        int cat1, cat2, hipotenusa;
        cat1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
        cat2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
        hipotenusa = (int) Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2, 2));
        JOptionPane.showMessageDialog(null,"A hipotenusa do triângulo retângulo é igual a: " + hipotenusa);
    }
}
