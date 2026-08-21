import javax.swing.JOptionPane;
// Calcular a soma entre dois valores
public class Soma {
    public static void main (String args [ ] ) {
    int valor1, valor2, soma;
    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
    soma = valor1 + valor2;
    System.out.println(" A soma dos valores é: " + soma);
    }
}