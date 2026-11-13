import java.util.Scanner;
public class Ejercicios_WhileyParame {

      public static int contarDigitos(int n) {
        if (n == 0) {
            return 1;
        }
        int contador = 0;
        while (n != 0) {
                n = n / 10;
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = src.nextInt();
        System.out.println("Tiene " + contarDigitos(numero) + " dígitos");
    }
}