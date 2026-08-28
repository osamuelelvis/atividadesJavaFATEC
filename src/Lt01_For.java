import javax.swing.JOptionPane;
public class Lt01_For  {
    public static void main (String args[]) {
        int num = 10, res;
        for (num = 10; num <= 30; num++) {
            res = (num * num);
            System.out.println("O valor é "+num+"; quadrado é "+res);
        }
    }
}
