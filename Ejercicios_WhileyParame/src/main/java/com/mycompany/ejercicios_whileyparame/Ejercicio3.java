import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese los numeros que desee: ");
        int entero= src.nextInt();
        int   contador_pares = 0;
        int contador_impares = 0;
        int contador_general= 0;
        
        while(entero != 0 ){
            if(entero % 2 == 0){
                contador_pares++;
                contador_general++;
            }
            else{
                contador_impares++ ;
                contador_general++;
            }
            System.out.println("Ingrese otro numero:");
            entero= src.nextInt();
            
        }
        
        System.out.println("--RESUMEN--");
        System.out.println("Se registraron: "+contador_general + " numeros.");
        System.out.println( contador_pares + " numero pares.");
        System.out.println(contador_impares + " numeros impares.");
    }
}
