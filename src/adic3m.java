import java.util.Scanner;
public class adic3m {
    public static void main(String[] args) {      
               
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt(); 
        calcular(n);
        sc.close();
    }   
    
    public static void calcular(int x) {
        System.out.println(" "); 

        System.out.println("El doble de " + x + " es: " + (x*2));
       
        System.out.println("El triple de " + x + " es: " + (x*3));

        System.out.println(" ");  

    }

    
}     

    

