import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("\nPROBLEMA 1: Solicita dos números al usuario y muestra la suma.");

        Scanner entrada = new Scanner(System.in);

        int  num1, num2;

        System.out.println("Ingrese dos numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        int operacion = num1 + num2;

        System.out.println("La suma de los dos numeros es: " + operacion);

        System.out.println("\nPROBLEMA 2: Pide un número entero y determina si es par o impar.");

        int numeroPareIm;

        System.out.println("Ingrese un numero");
        numeroPareIm = entrada.nextInt();

        if (numeroPareIm % 2==0) {
            System.out.println("Numero ingresado es par: " + numeroPareIm);
        }else{
            System.out.println("Numero ingresado es impar: " + numeroPareIm);
        }

        System.out.println("\nPROBLEMA 3: Solicita tres calificaciones y muestra el promedio final.");

        double calf1, calif2, calif3;

        System.out.println("Ingrese 3 Calificaciones: ");
        calf1 = entrada.nextDouble();
        calif2 = entrada.nextDouble();
        calif3 = entrada.nextDouble();

        double operation = (calf1+calif2+calif3)/3;
        double redO = Math.round(operation * 100)/100;

        if (operation>= 6) {
            System.out.println("Promedio: " + redO + " APROBADO");
        }else{
            System.out.println("Promedio: " + redO + " REPROBADO");
        }
        System.out.println("\nPROBLEMA 4: Pide dos números e indica cuál es mayor o si son iguales.");
        int numero1, numero2;
        System.out.println("Ingrese dos numeros enteros: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        if (numero1>numero2) {
            System.out.println("Numero mayor es: " + numero1);            
        }else if(numero2>numero1){
            System.out.println("Numero mayor es: "+numero2);
        }else if(numero1==numero2){ 
            System.out.println("Ambos numeros son iguales " + numero1 +" = "+ numero2);
        }else{
            System.out.println("Ninguno se cumple...");
        }
        System.out.println("PROBLEMA 5: Solicita un número y muestra su tabla del 1 al 10.");
        int table;

        System.out.println("Ingrese un numero: ");
        table = entrada.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(table +" X "+ i +" = " + i*table);
        }
        System.out.println("PROBLEMA 6: Pide base y altura, luego calcula y muestra el área.");
        int base, altura;

        System.out.println("Ingrese la base de su rectangulo: ");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura de su rectangulo: ");
        altura=entrada.nextInt();

        int area = (base*altura);

        System.out.println("El area del rectangulo es: "+ area + " metros cuadrados");
        System.out.println("\nPROBLEMA 7: Solicita una temperatura en grados Celsius y conviértela a Fahrenheit.");

        double temperatura = 0.0;

        System.out.println("Ingrese una temperatura en grados Celsius: ");
        temperatura=entrada.nextInt();

        double operacion_temperatura = (temperatura * 9/5) + 32;

        System.out.println("Temperatura en Fahrenheit: " + operacion_temperatura + "°F");

        System.out.println("PROBLEMA 8: Pide varios números y cuenta cuántos son positivos (termina cuando el usuario ingrese 0).");
        int variosnum;
        int contador = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            variosnum = entrada.nextInt();

            if (variosnum > 0) {
                contador++;
            }

        } while (variosnum != 0);

        System.out.println("Cantidad de números positivos: " + contador);

        System.out.println("PROBLEMA 9: Solicita una contraseña y verifica si coincide con una clave guardada.");

        String contraseña = "Baby_f";
        entrada.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String intento = entrada.nextLine();

        if(intento.equals(contraseña)){
            System.out.println("WELCOME TO WEB...");
        }else{
            System.out.println("Contraseña incorecta, intente de nuevo");
        }
        System.out.println("PROBLEMA 10: Pide la edad de una persona e indica si puede votar o no");
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        if (edad>=18) {
            System.out.println("Puedes votar");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}