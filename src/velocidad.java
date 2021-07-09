import java.util.Scanner;
public class velocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("\nIngresa la velocidad en km/h: ");
        double velKH = sc.nextDouble();
        double velMS = (velKH*1000)/3600;
        double redondear = Math.round(velMS*100.0)/100.0;
        System.out.println(velKH+" km/h equivalen a "+redondear+" m/s aproximadamente \n");
        sc.close();
    }

    
}
