import java.util.Scanner;
public class mayuscula {
    private static Scanner sc;
    public static void main( String[] args ) {
        sc = new Scanner(System.in);
        System.out.println("Ingresa un caracter: ");
        char caracter;
        caracter = sc.next().charAt(0);
        boolean valor = Character.isUpperCase(caracter);
        if (valor == true) {
            System.out.println("El caracter "+caracter+" es una letra mayúscula");
        } else {
            System.out.println("El caracter "+caracter+" no es una letra mayúscula");
        }   

        }
    
}
