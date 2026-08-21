import javax.swing.JOptionPane;
public class LT01_ESTSEQ16 {
    public static void main (String args[]) {
        int qtd_horas_trabalhadas, desconto, descendentes;
        float salario_bruto, salario_liquido, valor_hora;
        qtd_horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        valor_hora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora"));
        desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto (em %)"));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Quantos descendentes são?"));
        salario_bruto = qtd_horas_trabalhadas * valor_hora;
        salario_liquido = salario_bruto - (salario_bruto * (desconto / 100)) + (descendentes * 100);
        JOptionPane.showMessageDialog(null,"Salário a receber: R$" + salario_liquido);
    }
}
