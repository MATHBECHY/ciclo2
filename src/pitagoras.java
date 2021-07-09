import java.util.Scanner;
public class pitagoras {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Ingresa la medida del primer cateto: ");
        Double cat1 = sc.nextDouble();
        System.out.println ("Ingresa la medida del segundo cateto: ");
        Double cat2 = sc.nextDouble();
        sc.close();

        System.out.printf("El valor de la hipotenusa es de %.2f cm", hipotenusa(cat1, cat2));
    }

public static double hipotenusa(double a, double b){
    double c = Math.sqrt(a*a+b*b);
    return c;
}


}

    

