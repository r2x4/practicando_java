import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args){
        System.out.println("Aprendiendo Java");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa tu estatura: ");
        double estatura = scanner.nextDouble();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Estudiante: " + esEstudiante);

        scanner.close();


    }
}
