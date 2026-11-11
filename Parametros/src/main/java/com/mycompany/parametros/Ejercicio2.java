import java.util.Scanner;
public class Ejercicio2 {
    public static int Cuadrado(int n){
        return n* n ;
    }
    
    public static void main(String[]args){
        Scanner src = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int numero= src.nextInt();
        int resultado= Cuadrado(numero);
        System.out.println("La potencia de " + numero + " es: " + resultado);
    }
}
