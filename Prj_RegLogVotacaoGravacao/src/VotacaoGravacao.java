
import java.io.IOException;
import javax.swing.JOptionPane;

public class VotacaoGravacao {

    public static void main(String[] args) throws IOException {
        CadastroEleitor[] cadastroeleitor = new CadastroEleitor[10];
        CadastroVotacao[] votacao1 = new CadastroVotacao[5];
        CadastroVotacao[] votacao2 = new CadastroVotacao[5];
        MetodosVotacao m = new MetodosVotacao();
        for (int i = 0; i < 10; i++) {
            cadastroeleitor[i] = new CadastroEleitor();
        }
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Eleitor \n 2 - Cadastra Votação 1 e 2 \n 3 - Agrupa Apuração \n 4 - Menu Estatística \n 9 - FIM"));
            switch (opc) {
                case 1:
                    cadastroeleitor = m.FCadastraEleitor(cadastroeleitor);
                    break;
                case 2:
                    boolean subMenu1 = true;
                    while (subMenu1) {
                        int opc1 = 0;
                        opc1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Votação 1 \n 2 - Cadastro Votação 2 \n 9 - FIM"));
                        switch (opc1) {
                            case 1:
                                /*bla bla bla*/
                                break;
                            case 2:
                                /*bla bla bla*/
                                break;
                            case 9:
                                subMenu1 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                        }

                    }
                case 3:
                    /*bla bla bla*/
                    break;
                case 4:
                    boolean subMenu2 = true;
                    while (subMenu2) {
                        int opc2 = 0;
                        opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Vencedor \n 2 - Segundo colocado \n 3 - Quantidade de votos em branco \n 4 - Quantidade de votos nulos \n 5 - Mostra eleitores \n 6 - Mostra apuração \n 9 - FIM"));
                        switch (opc2) {
                            case 1:
                                /*bla bla bla*/
                                break;
                            case 2:
                                /*bla bla bla*/
                                break;
                            case 3:
                                /*bla bla bla*/
                                break;
                            case 4:
                                /*bla bla bla*/
                                break;
                            case 5:
                                /*bla bla bla*/
                                break;
                            case 6:
                                /*bla bla bla*/
                                break;
                            case 9:
                                subMenu2 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                                break;
                        }

                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
