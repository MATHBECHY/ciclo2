import java.util.Scanner;
public class adic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura en grados Celsius: ");
        Double x = sc.nextDouble();
        convertCelsiusToFahrenheit(x);
        sc.close();
    }

    public static double convertCelsiusToFahrenheit(Double celsius) {
        double Fahrenheit = 32 + 9*celsius/5;
        System.out.println(Fahrenheit);

        return Fahrenheit;
    }
} 
