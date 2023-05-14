public class SentenciaWhileAndDoWhile {
    public static void main(String[] args) {

        // Se ejecuta siempre y cuando se cumpla la condicion
        int i = 10;
        while (i >=5){
            System.out.println("i = " + i);
            i--;
        }

        // Se ejecuta al menos una vez
        do {
            System.out.println("i = " + i);
            i--;
        }while (i >= 1);
    }
}
