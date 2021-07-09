import java.util.Scanner;
public class parImpar {
    
        public static void main( String[] args ) {
            int numero;
            Scanner sc = new Scanner( System.in );
    
            System.out.printf( "Ingresa un número entero: " );
            numero = sc.nextInt();
            sc.close(); 
    
            /*if ( numero % 2 == 0 ) {
                System.out.printf(numero + " es par" );
            }
            else {
                System.out.printf(numero + " es impar" );
            }
            
            */
            System.out.println(" ");
            System.out.println(numero % 2 == 0 ? numero + " es par" : numero + " es impar");
            System.out.println(" ");
        }
    }    

