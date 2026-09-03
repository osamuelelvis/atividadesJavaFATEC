import javax.swing.JOptionPane;
public class LT01_ESTREP32 {
    public static void main (String args[]) {
        int i, num, fat = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (i = 1; i <= num; i++) {
            fat = fat * i;
        System.out.println("Fatorial de "+num+": "+fat);
    }
}
} 