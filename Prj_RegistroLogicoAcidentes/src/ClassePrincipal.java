import javax.swing.*;
public class ClassePrincipal {
    public static void main (String args[]) {
        Estatistica[] estatistica = new Estatistica[10];
        ClasseMetodos m = new ClasseMetodos();
        for (int i = 0; i < 10; i++) {
            estatistica[i] = new Estatistica();
        }
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATÍSTICA \n 1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
            switch(opc) {
                case 1:
                    estatistica = m.FCadastraEstatistica(estatistica);
                    break;
                case 2:
                    m.PQtdAcidentes(estatistica);
                    break;
                case 3: 
                    m.PMaiorMenor(estatistica);
                    break;
                case 4:
                    m.PAcima(estatistica);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
                default: 
                JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    }
}
