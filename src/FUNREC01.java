public class FUNREC01 {
    public static int calcular (int n) {
        int valor;
        if (n == 0) {
            return 0;
        }
        valor = n + calcular(n -1);
        System.out.println(valor);
        return valor;
    }
    public static void main (String args[]) {
        int resultado = calcular(5);
        System.out.println(resultado);
    }
}
