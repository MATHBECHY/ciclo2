//Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
//Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234
import java.util.Scanner;
public class quitarCifras {
    public static void main(String[] args) {
        System.out.println("El número ingresado queda: " + numero());

    }
    private static Scanner sc;
    public static int numero() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa un número de varias cifras: ");
        int N = sc.nextInt();
        System.out.println("Ingresa las cifras que deseas quitar: ");
        int n = sc.nextInt();
        int potencia = (int)Math.pow(10,n);
        int nuevoValor = N / potencia;
        return nuevoValor;
    
    }
    
}
