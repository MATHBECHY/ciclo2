import java.util.Scanner;
public class adic3 {
    
    public static void main(String[] args) {        
        
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        x = sc.nextInt(); 
        
        System.out.println(" ");       

        System.out.println("El doble de " + x + " es: " + (x*2));
       
        System.out.println("El triple de " + x + " es: " + (x*3));
        System.out.println(" ");

        sc.close();    

    }

    
}     
