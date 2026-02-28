import java.util.Scanner;
import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Integer> pilas = new Stack<Integer>();

        System.out.println("Lista vacia: " + pilas);
        System.out.println("Esta vacia?: " + pilas.empty());

        System.out.println("Ingrese su numero 1: " );
        int num1 = entrada.nextInt();
        pilas.push(num1);
        System.out.println("Ingrese su numero 2: " );
        int num2 = entrada.nextInt();
        pilas.push(num2);
        System.out.println("Ingrese su numero 3: " );
        int num3 = entrada.nextInt();
        pilas.push(num3);
        System.out.println("Ingrese su numero 4: " );
        int num4 = entrada.nextInt();
        pilas.push(num4);
        for(Integer pilita : pilas){
            System.out.println(pilita);
        }
        System.out.println("Lista vacia: " + pilas);
        System.out.println("Esta vacia?: " + pilas.empty());
    }
}