import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Serie Fibonacci: indica cuántos valores quieres obtener de la serie");
        Scanner sc = new Scanner(System.in);
        int contador = sc.nextInt();
        int numero1 = 0;
        int numero2 = 1;
        System.out.println(numero1);
        for (int i = 0; i < contador; i++){
            int sumanumeros = numero1 + numero2;
            numero1 = numero2;
            numero2 = sumanumeros;
            System.out.println(numero1);
        }
    }
}