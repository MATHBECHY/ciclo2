//Revisar clase del 6 de julio

public class suerte {
    public static int obtenerNumeroSuerte(String fecha){
        int numeroSuerte = 0;
        String [] arregloFecha = fecha.split("/", 3);
        int valorDia = Integer.parseInt(arregloFecha[0]);
        int valorMes = Integer.parseInt(arregloFecha[1]);
        int valorAnio = Integer.parseInt(arregloFecha[2]);

        int sumaPartesFechas = valorDia + valorMes + valorAnio;

        while(sumaPartesFechas >0){
            numeroSuerte += sumaPartesFechas %10;
            sumaPartesFechas = (sumaPartesFechas/10);
        }
        return numeroSuerte;


    }
    
}
public static void main( String[] args ) {
    System.out.print("El número de la suerte es: ");
    System.out.println(obtenerNumeroSuerte("12/12/1992"));
}