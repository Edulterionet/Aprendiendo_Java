
    public class Ejercicio5 {
        public static int area( int n ){
            return n * n ;
        }
        public static int area( int base , int altura ){
            return base * altura;
        }
        public static double area( double radio ){
            return 3.14159 * radio * radio;
        }

        public static void main(String[]args){
            int n = 5 ;
            int base = 2;
            int altura = 4;
            double radio = 3;
            
            System.out.println("El area del cuadrado es: "+ area(n));
            System.out.println("El area del rectangulo es: "+ area(base,altura));
            System.out.println("El area del circulo es: "+ area(radio));
        }
    }
