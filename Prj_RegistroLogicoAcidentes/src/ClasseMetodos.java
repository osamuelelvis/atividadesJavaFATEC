import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Estatistica[] FCadastraEstatistica(Estatistica[] estatistica) {
        for (int i = 0; i < 10; i++) {
            estatistica[i].codigo = JOptionPane.showInputDialog("Digite o código da cidade");
            estatistica[i].nome = JOptionPane.showInputDialog("Digite o nome da cidade");
            estatistica[i].acidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes"));
        }
        return estatistica;
    }
    public void PQtdAcidentes(Estatistica[] estatistica) {
        for (int i = 0; i < 10; i++) {
            if (estatistica[i].acidentes > 100 && estatistica[i].acidentes < 500) {
                System.out.println("Cidade: "+estatistica[i].nome+"; Quantidade de acidentes: "+estatistica[i].acidentes);
            }
        }
    }
    public void PMaiorMenor(Estatistica[] estatistica) {
        int maior = 0;
        int menor = 9999;
        for (int i = 0; i < 10; i++) {
            if (estatistica[i].acidentes > maior) {
                maior = estatistica[i].acidentes;
            }
            if (estatistica[i].acidentes < menor) {
                menor = estatistica[i].acidentes;
            }
        }
        System.out.println("Menor número de acidentes: "+menor+"\n Maior número de acidentes: "+maior);
    }
    static void PAcima(Estatistica[] estatistica) {
        double media;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + estatistica[i].acidentes;
        }
        media = soma / 10;
        System.out.println("Média de acidentes: "+media);
        for (int i = 0; i < 10; i++) {
            if (estatistica[i].acidentes > media) {
                System.out.println("Cidade: "+estatistica[i].nome+"; Quantidade de acidentes: "+estatistica[i].acidentes);
            }
        }
    }
}
