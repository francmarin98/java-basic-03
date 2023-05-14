import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        int promedioMayores = 0, promedioMenores = 0, cantidadNotaUno = 0;
        double promedio = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de alumnos del curso: ");
        int totalAlumnos = scanner.nextInt();

        for (int i = 0; i < totalAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno "+ (i+1) +" : ");
            double notaActual = scanner.nextDouble();

            if(notaActual <= 4){
                promedioMenores++;
                promedio += notaActual;
                continue;
            }

            if (notaActual >= 5){
                promedioMayores++;
                promedio += notaActual;
                continue;
            }

            if (notaActual == 1){
                cantidadNotaUno++;
                promedio += notaActual;
                continue;
            }

            if (notaActual == 0){
                System.out.println("Error, finalizando el programa");
                break;
            }

        }

        System.out.println("totalAlumnos = " + totalAlumnos);
        System.out.println("promedioMayores a 5 = " + promedioMayores);
        System.out.println("promedioMenores a 4 = " + promedioMenores);
        System.out.println("cantidadNotaUno = " + cantidadNotaUno);
        System.out.println("promedio = " + promedio / totalAlumnos);


    }
}
