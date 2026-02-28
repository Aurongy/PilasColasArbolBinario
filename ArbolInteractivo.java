import java.util.Scanner;

class Nodo {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}

public class NodoArbol {

    static Scanner entrada = new Scanner(System.in);

    public static Nodo crearNodo() {
        System.out.print("Ingrese el valor del nodo: ");
        int valor = entrada.nextInt();

        Nodo nuevo = new Nodo(valor);

        System.out.print("¿Desea agregar hijo izquierdo de " + valor + "? (1=Si, 0=No): ");
        int opcionIzq = entrada.nextInt();

        if (opcionIzq == 1) {
            System.out.println("Creando hijo izquierdo de " + valor);
            nuevo.izquierda = crearNodo();
        }

        System.out.print("¿Desea agregar hijo derecho de " + valor + "? (1=Si, 0=No): ");
        int opcionDer = entrada.nextInt();

        if (opcionDer == 1) {
            System.out.println("Creando hijo derecho de " + valor);
            nuevo.derecha = crearNodo();
        }

        return nuevo;
    }

    public static void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.izquierda);
            System.out.print(raiz.dato + " ");
            inOrden(raiz.derecha);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== CREACION DE ARBOL BINARIO ===");

        Nodo raiz = crearNodo();

        System.out.println("\nRecorrido InOrden del arbol:");
        inOrden(raiz);
    }
}
