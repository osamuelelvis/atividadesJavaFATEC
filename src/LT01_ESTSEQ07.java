import javax.swing.JOptionPane;
public class LT01_ESTSEQ07 {
    public static void main (String args[]) {
        int comprimento, largura, altura, volume;
        comprimento = Integer.parseInt("Digite o comprimento do paralelepípedo");
        largura = Integer.parseInt("Digite o comprimento do paralelepípedo");
        altura = Integer.parseInt("Digite o comprimento do paralelepípedo");
        volume = (comprimento * largura * altura);
        JOptionPane.showMessageDialog(null,"O volume do paralelepípedo é de " + volume + "cm²");
    }
}
