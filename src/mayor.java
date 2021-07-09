import java.util.Scanner;
public class mayor {
    private static Scanner sc;
    public static void main(String[]args) {
        sc = new Scanner(System.in);
        System.out.println("Vamos a encontrar el mayor de 3 números");
        System.out.println("Ingresa el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el tercer número:");
        int num3 = sc.nextInt();

        if ((num1 > num2) & (num1 > num3)){
            System.out.println("El número mayor es "+num1);
        }
        else if ((num2 > num1) & (num2 > num3)){
            System.out.println("El número mayor es "+num2);
        }
        else {
            System.out.println("El número mayor es "+num3);
        }
    }

}
      


