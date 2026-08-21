import javax.swing.JOptionPane;
public class LT01_ESTSEQ17 {
    public static void main (String args[]) {
        int qtd_litros, tempo;
        float velocidade_media;
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo gasto no percurso (em horas)"));
        velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média (em km/h)"));
        qtd_litros = (int) ((double) (velocidade_media * tempo) / 12);
        JOptionPane.showMessageDialog(null,"A quantidade de combustível gasta foi de: " + qtd_litros + " litros.");
    }
}
