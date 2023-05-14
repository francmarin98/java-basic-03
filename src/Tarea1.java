import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
        int totalNumeros = scanner.nextInt();

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Ingrese el número "+(i+1)+" : ");
            int num = scanner.nextInt();

            if (num < 10) {
                System.out.println("El número ingresado es menor que 10!");
            }else {
                System.out.println("El número ingresado es igual o mayor que 10!");
            }
        }
    }
}
