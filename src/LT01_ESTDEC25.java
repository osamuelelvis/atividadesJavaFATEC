import javax.swing.JOptionPane;
public class LT01_ESTDEC25 {
    public static void main (String args[]) {
        int hora_inicio, hora_final, minuto_inicio, minuto_final, inicio, fim, horas, minutos, duracao;
        hora_inicio = Integer.parseInt(JOptionPane.showInputDialog("Que hora começou o jogo?"));
        minuto_inicio = Integer.parseInt(JOptionPane.showInputDialog("Sabe me informar os minutos que começou o jogo?"));
        hora_final = Integer.parseInt(JOptionPane.showInputDialog("Ótimo! Agora, sabe me dizer a hora que o jogo acabou?"));
        minuto_final = Integer.parseInt(JOptionPane.showInputDialog("E qual minuto marcava o fim do jogo?"));
        inicio = (hora_inicio * 60) + minuto_inicio;
        fim = (hora_final * 60) + minuto_final;
        if (fim >= inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (1440 - inicio) + fim;
        }
        horas = duracao / 60;
        minutos =  duracao % 60;
        JOptionPane.showMessageDialog(null,"O jogo durou "+horas+" horas e "+minutos+ " minutos."); 
    }
}
