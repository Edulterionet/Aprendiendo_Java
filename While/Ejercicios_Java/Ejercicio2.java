
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
      
         int suma = 0;
        System.out.println("Ingrese los numeros que deseas sumar: ( Ingrese 0 para terminar) ");
          int numero = src.nextInt();
        while(numero != 0){
            suma += numero;
            System.out.println("Ingrese otro numero: ");
            numero = src.nextInt();
            
        }
        
        System.out.println("EL resultado de sus numeros es : "+ suma);
    }
}
