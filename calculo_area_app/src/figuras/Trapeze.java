package figuras;
import java.util.Scanner;

public class Trapeze {
    private static Scanner scanner = new Scanner(System.in);
    public static void calculateArea() {
        System.out.println("Introduce la base mayor");
        double baseMayor = scanner.nextDouble();
        System.out.println("Introduce la base menor");
        double baseMenor = scanner.nextDouble();
        System.out.println("Introduce la altura");
        double altura = scanner.nextDouble();
        double resultado = ((baseMayor + baseMenor) * altura) / 2;
        System.out.println("El area del trapecio es: " + resultado);
    }

    public static void closeScanner(){
        scanner.close();
    }
}
