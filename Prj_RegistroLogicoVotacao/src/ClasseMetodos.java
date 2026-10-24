import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Votacao[] FCadastraVotacao(Votacao[] votacao) {
        for (int i = 0; i < 10; i++) {
            votacao[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção"));
        }
        for (int i = 0; i < 300; i++) {
            votacao[i].candidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato"));
        }
        return votacao;
    }
    public Votacao[] FClassificaSecao(Votacao[] votacao) {
        int maior = 0;
        int menor = 9999;
        for (int i = 0; i < 200; i++) {
            if (votacao[i].secao > maior) {
                maior = votacao[i].secao;
            }
            if (votacao[i].secao < menor) {
                menor = votacao[i].secao;
            }
        }
        JOptionPane.showMessageDialog(null,"Dados classificados");
        return votacao;
    }
    public Votacao[] FGravaVotacao(Votacao[] votacao) {
        return null;
    }
}
