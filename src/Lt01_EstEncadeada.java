import javax.swing.*;
public class Lt01_EstEncadeada {
    public static void main (String args[]) {
        double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        }
        else {
            if (media < 3) {
                System.out.println("Aluno reprovado");
            }
            else {
                System.out.println("Aluno em exame");
            } // do media < 3
        } // do media >= 7
    }
}
