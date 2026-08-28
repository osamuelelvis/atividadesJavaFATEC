import javax.swing.JOptionPane;
public class Lt01_Faça {
    public static void main (String args[])
      {
        int num= 10, res;
        do {
            res = (num * num);
            System.out.println(" O valor é "+num+ "; quadrado é "+res);
            num = (num+1); }
           while ((num>=10) && (num<=30));
     }
}
