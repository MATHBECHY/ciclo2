import java.util.Scanner;

public class EJ2_IVA {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el valor de la unidad: ");
    double valorUnidad = sc.nextDouble();

    System.out.println("Ingrese la cantidad de productos vendidos: ");
    double productosVendidos = sc.nextDouble();

    System.out.println("Ingrese el porcentaje de IVA: ");
    double iva = sc.nextDouble();

    sc.close();

    double porcentajeIva = (iva)/100;
    double valorIva = (valorUnidad*productosVendidos)*porcentajeIva;
    double costo = (valorUnidad*productosVendidos)+valorIva;
    
    System.out.println("El costo del producto con IVA es: "+costo);
    }

    
}
