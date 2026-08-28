import javax.swing.JOptionPane;
public class Lt01_Enquanto {
    public static void main (String args[]) {
        int num = 10, res;
        while ((num >= 10) && (num <= 30)) {
            res = (num * num);
            System.out.println("O valor é "+num+"; quadrado é"+res);
            num = (num+1);
        }
    }
}
