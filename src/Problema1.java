public class Problema1 {

    private int cadena_de_numeros() {
        int result = 0;
        for (int i = 0; i < 20; i++) {
            if (es_multiplo_de_3(result)){
                String name = "Fizz";

            }else if (es_multiplo_de_5(result)){
                String name = "Buzz";

            }else if (es_multiplo_de_3(result) && es_multiplo_de_5(result)){
                String name = "FizzBuzz";
            }
        }
        return result;
    }

    private boolean es_multiplo_de_3(Integer n) {
        return n % 3 == 0;
    }

    private boolean es_multiplo_de_5(Integer n) {
        return n % 5 == 0;
    }



}