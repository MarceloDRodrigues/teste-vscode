public class testinho {

    public static int multi(float a, float b) {
        int i;
        int resultado = 0;
        for (i = 0; i < b; i++) {
            resultado += a;

        }
        return resultado;
    }

    public static float potencia(float x, int y) {
        float resultado = 1;
        boolean positivo = true;
        boolean baseNegativa = false;
        if (x < 0){
            if (y % 2 == 0){
                x = -x;
            }else{
                x = -x;
                 baseNegativa = true;
            }
        }
        if (y < 0){
            positivo = false;
            y = -y;
        }
     
        for (int i = 0; i < y; i++) {
            resultado = testinho.multi(resultado, x);
            
        }
        if (positivo != true){
       
            resultado = 1 / resultado;
       
        }
        if (baseNegativa == true){
            resultado = -resultado;
        }
        System.out.println(resultado);
        return resultado;

    }

    public static void main(String[] args) throws Exception {

        testinho.potencia(6, -2);
        testinho.potencia(4, 2);
        testinho.potencia(0, 2);
        testinho.potencia(-3, 3);
    }
}

