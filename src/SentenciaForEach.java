public class SentenciaForEach {
    public static void main(String[] args) {
        // Solo se utiliza para arreglos y objetos de colección en Java, es similar al for, pero este es más declarativo
        int numeros[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int current: numeros){
            System.out.println("current = " + current);
        }
    }
}
