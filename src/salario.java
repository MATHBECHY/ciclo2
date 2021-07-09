
import java.util.Scanner;
public class salario {

    public static void main(String[] args) {
        //Número de horas trabajadas
        System.out.println("Ingrese la cantidad de horas: ");
        Scanner sc = new Scanner(System.in);
        int horasTrabajadas = sc.nextInt();

        //Costo de las horas trabajadas
        System.out.println("Ingrese el costo de la hora: ");
        double costoHora = sc.nextDouble();

        sc.close();

        //Calcular pago
        double pago = horasTrabajadas*costoHora;

        //Mostrar el pago en pantalla
        System.out.println("El pago del empleado es: "+pago);

    }

    
}
