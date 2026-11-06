import java.io.*;
import javax.swing.*;
public class MetodosVotacao {
    public CadastroEleitor[] FCadastraEleitor (CadastroEleitor[] eleitor) {
        for (int i = 0; i < 10; i++) {
            eleitor[i].numeleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor"));
            eleitor[i].nomeeleitor = JOptionPane.showInputDialog("Digite o nome do eleitor");
            eleitor[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de seção do eleitor"));
        }
        return eleitor;
    }
    
    public CadastroVotacao[] Voto (CadastroEleitor[] eleitores) {
        CadastroVotacao[] votos = new CadastroVotacao[10];
        for (int i = 0; i < 10; i++) {
            CadastroVotacao voto = new CadastroVotacao();
            voto.numeleitor = eleitores[i].numeleitor;
            voto.secao = eleitores[i].secao;
            
            do {
                voto.codcandidato = Integer.parseInt(JOptionPane.showInputDialog("1 - José \n 2 - Maria \n 3 - Branco \n 4 - Nulo"));
                if (voto.codcandidato < 1 || voto.codcandidato > 4) {
                    JOptionPane.showMessageDialog(null,"VOTO INVÁLIDO! DIGITE NOVAMENTE!");
                }
            } while (voto.codcandidato < 1 || voto.codcandidato > 4);
            votos[i] = voto;
        }
        return votos;
    }
    
    public CadastroVotacao[] FCadastraVotacao1 (CadastroVotacao[] votacao1) {
        
        return null;
    }
}
