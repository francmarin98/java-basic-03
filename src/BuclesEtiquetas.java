public class BuclesEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i <= 7; i++) {
            bucle2: for (int j = 0; j < 5; j++) {
                if(j == 2){
                    continue bucle1;
                }
                System.out.println("[i == "+ i +"] [j == " + j +"] ");
            }
        }

        bucle3:
        for (int i = 0; i < 5; i++) {
            bucle4: for (int j = 0; j < 5; j++) {
                if(j == 2){
                    break bucle3;
                }
                System.out.println("i = " + i);
                System.out.println("j = " + j);
            }
        }
    }
}
