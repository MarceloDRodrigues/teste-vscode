public class App {

    public static int multi(int a, int b) {
        int i;
        int resultado = 0;
        for (i = 0; i < b; i++) {
            resultado += a;

        }
        return resultado;
    }

    public static int potencia(int x, int y) {
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado = App.multi(resultado, x);
            System.out.println(resultado);
        }
        return resultado;

    }

    public static void main(String[] args) throws Exception {

        App.potencia(6, 3);
    }
}

