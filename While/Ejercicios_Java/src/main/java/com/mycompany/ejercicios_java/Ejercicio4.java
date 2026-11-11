import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
       
        System.out.println("--BIENVENIDO--");
        System.out.println("Ingrese una nota: ");
        int nota = src.nextInt();
        while(nota < 0 || nota > 5){
            
            System.out.println("Ingrese una nota entre 0 y 5");
            nota = src.nextInt();
        }
        System.out.println("Nota Registrada, Gracias");
    }
}
