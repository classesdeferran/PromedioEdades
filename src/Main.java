import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Programa que calcula el promedio de edad de un grupo de personas");

        System.out.println("\n¿Cuántas personas hay que incluir?");
        int numPersonas = input.nextInt();

        System.out.println("El promedio de edad es "+ mediaEdad(numPersonas, input));

        input.close();

    }

    private static Double mediaEdad(int numPersonas, Scanner input) {

        double suma = 0;
        int numPersonasOk = numPersonas;

        for (int i = 1; i <= numPersonas; i++) {
            System.out.println("\nEdad de la persona nº"+(i)+" : ");
            int edad = input.nextInt();

            if (edad < 0 || edad >= 120) {
                System.out.println("El valor '"+edad+"' es incorrecto");
                numPersonasOk = numPersonasOk - 1;
            } else {
                suma += edad;
            }
        }

        return suma / numPersonasOk;

    } // Fin del método

}