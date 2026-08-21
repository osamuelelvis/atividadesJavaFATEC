import javax.swing.JOptionPane;
public class LT01_ESTSEQ01 {
    public static void main (String args[]){
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado"));
        area = (lado * lado);
        JOptionPane.showMessageDialog(null,"A área do quadrado é igual a " + area);
    }
}
