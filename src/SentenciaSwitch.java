import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num){
            case 0:
                System.out.println("Es cero");
                break;

            case 1:
                System.out.println("Es uno");
                break;

            case 2:
                System.out.println("Es dos");
                break;

            case 3:
                System.out.println("Es tres");
                break;

            default:
                System.out.println("No se que número es jeje");
                break;
        }


    }
}
