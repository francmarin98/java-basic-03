import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 =scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        for (int i = 1; i <= num1; i++) {
            resultado = resultado + num2;
        }

        System.out.println("Resultado de la multiplicación = " + resultado);

    }
}
