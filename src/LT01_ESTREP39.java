public class LT01_ESTREP39 {
    public static void main (String args[]) {
        long graos = 1;
        for (int casa = 1; casa <= 64; casa++) {
            System.out.println("Casa " + casa + ": " + graos + " grãos");
            graos = graos * 2;
        }
    }
}
