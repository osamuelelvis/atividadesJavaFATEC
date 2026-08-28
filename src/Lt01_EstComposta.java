import javax.swing.*;
public class Lt01_EstComposta {
    public static void main (String args[]) {
        // declaração de variáveis e/ou constantes
        int num1, num2, num3, soma;
        // mensagem ao usuário e entrada de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        // processamento de dados
        soma = num1 + num2+ num3;
        System.out.println("A soma dos três valores digitados é: " + soma);
        if (soma > 100) {
            // saída de resultados
            System.out.println("A soma é maior que 100");
        } // fim do if
        else {
            // saída de resultados
            System.out.println("A soma é menor ou igual a 100");
        } // fim do else
    } // fim do void main
} // fim da classe
