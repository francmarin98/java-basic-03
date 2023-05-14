public class SentenciaFor {
    public static void main(String[] args) {
        int j = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        for (; j < 5; j++) {
            System.out.println("j = " + j);
        }

        for (int k = 10; k > 0; k--) {
            System.out.println("k = " + k);
        }

        for (int l = 0, m = 10; l < m; l++) {
            System.out.println("l = " + l);
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
