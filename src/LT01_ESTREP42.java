public class LT01_ESTREP42 {
    public static void main (String args[]) {
        double denominador = 0.0;
        double serie = 0.0;
        for (int i = 1; i <= 50; i++) {
            double divisao = i / denominador;
            serie = serie + divisao;
            System.out.println(serie);
            denominador = denominador + 2;
        }
    }
}
