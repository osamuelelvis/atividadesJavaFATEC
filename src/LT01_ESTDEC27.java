import javax.swing.JOptionPane;
public class LT01_ESTDEC27 {
    public static void main (String args []) {
        int voltas, duracao;
        double velocidade_media, extensao, distancia, distancia_km, duracao_horas;
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas"));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros)"));
        duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração em minutos"));
        
        distancia = voltas * extensao;
        distancia_km = distancia / 1000;
        duracao_horas = duracao / 60.0;
        velocidade_media = distancia_km / duracao_horas;
        
        JOptionPane.showMessageDialog(null,"A velocidade média é igual a: "+velocidade_media+"km/h");
    }
}
