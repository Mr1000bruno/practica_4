// Pentagon.java
package figuras;
import java.util.Scanner;

public class Pentagon {
    private static Scanner scanner = new Scanner(System.in);
    public static void calculateArea() {
        System.out.print("Ingrese el lado del pentágono: ");
        double side = scanner.nextDouble();
        System.out.print("Ingrese la apotema del pentágono: ");
        double apothem = scanner.nextDouble();
        double area = 0.5 * 5 * side * apothem;
        System.out.println("El área del pentágono es: " + area);
    }

    public static void closeScanner(){
        scanner.close();
    }
}