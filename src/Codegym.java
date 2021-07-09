
import java.util.Scanner;
public class Codegym {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el salario inicial: ");
        int x = sc.nextInt(); 
        hackSalary(x);
        sc.close();

    }

    public static void hackSalary(int a) {
        System.out.println("Your salary is: " +(a + 1000)+ " dollars per month.");
    }
}

 
