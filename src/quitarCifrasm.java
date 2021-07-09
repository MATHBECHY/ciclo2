import java.util.Scanner;
public class quitarCifrasm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n = sc.nextInt();
        System.out.println("Ingrese la cantidad de cifras que desea quitar: ");
        int m = sc.nextInt();
        sc.close();

        String string = Integer.toString(n);
        if (m > string.length()){
            System.out.println("Ingrese una cantidad de cifras que no sea mayor que la del número ingresado:");

        }
        else {
            var potencia = (int)Math.pow(10,m);
            var nuevoNumero = n / potencia;
            System.out.println(nuevoNumero);
        }
    }

    
}
