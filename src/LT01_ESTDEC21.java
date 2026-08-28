import javax.swing.JOptionPane;
public class LT01_ESTDEC21 {
    public static void main (String args[]) {
        double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor bimestral do aluno"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor bimestral do aluno"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor bimestral do aluno"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor bimestral do aluno"));
        media = (n1 + n2 + n3 + n4) / 4;
        JOptionPane.showMessageDialog(null,"Média do aluno: "+media);
        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null,"APROVADO!");
        } else {
            if ((media >= 3.0) && (media < 6.0)) {
                JOptionPane.showMessageDialog(null,"EXAME!");
            } else {
                JOptionPane.showMessageDialog(null,"RETIDO!");
            }
        }
    }
}
