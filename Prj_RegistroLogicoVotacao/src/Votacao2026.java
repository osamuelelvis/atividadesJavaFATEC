import javax.swing.*;
public class Votacao2026 {
    public static void main (String args[]) {
        Votacao[] votacao = new Votacao[200];
        ClasseMetodos m = new ClasseMetodos();
        for (int i = 0; i < 200; i++) {
            votacao[i] = new Votacao();
        }
        int opc = 0;
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇÃO \n 1 - Carregar Seção/Número Eleitor \n 2 - Classificar por Seção \n 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizar"));
            switch(opc) {
                case 1:
                    votacao = m.FCadastraVotacao(votacao);
                    break;
                case 2:
                    m.FClassificaSecao(votacao);
                    break;
                case 3:
                    m.FGravaVotacao(votacao);
                    break;
                case 4:
                    boolean subMenu = true;
                    while (subMenu) {
                        int opc1 = 0;
                        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Mostrar Indicadores \n Estatísticas de Votação em 2026 \n 1 - Quantidade Eleitores por Seção \n 2 - Seção com Maior e Menor número de Eleitores \n 3 - Quantidade de votos por candidato \n 4 - 10 primeiros colocados (nro cand. e qttd votos) \n 9 - Finaliza consulta"));
                        switch (opc1) {
                            case 1:
                                m.PQtdEleitoresSecao(votacao);
                                break;
                            case 2:
                                m.PMaiorMenorEleitores(votacao);
                                break;
                            case 3:
                                m.PQtdVotosCandidato(votacao);
                                break;
                            case 4:
                                m.PDezMaisVotados(votacao);
                                break;
                            case 9:
                                subMenu = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Opção Inválida");
                                break;
                        }
                    }
                case 9:
                    JOptionPane.showMessageDialog(null,"Programa Finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
            }
        }
    }
}
