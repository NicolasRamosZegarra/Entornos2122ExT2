public class Problema1 {

    private int cadena_de_numeros() {
        int result = 0;
        for (int i = 0; i < 20; i++) {
            i = result++;
        }
        return result;
    }

    private boolean es_multiplo_de_3(Integer n) {
        return n % 3 == 0;
    }

    private boolean es_multiplo_de_5(Integer n) {
        return n % 5 == 0;
    }

    private boolean es_multiplo_de_3_y_5(Integer n) {
        return n % 5 == 0;
    }
    

}