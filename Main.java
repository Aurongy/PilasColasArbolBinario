import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    // Insertar al inicio
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // Insertar al final
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Mostrar lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Buscar elemento
    public void buscar(int valor) {
        Nodo actual = cabeza;
        int posicion = 1;
        while (actual != null) {
            if (actual.dato == valor) {
                System.out.println("Elemento encontrado en la posición: " + posicion);
                return;
            }
            actual = actual.siguiente;
            posicion++;
        }
        System.out.println("Elemento no encontrado.");
    }

    // Eliminar elemento
    public void eliminar(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            System.out.println("Elemento eliminado.");
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            System.out.println("Elemento no encontrado.");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Elemento eliminado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion;

        do {
            System.out.println("\n--- MENU LISTA ENLAZADA ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Eliminar elemento");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    lista.insertarInicio(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Ingrese el valor: ");
                    lista.insertarFinal(sc.nextInt());
                    break;
                case 3:
                    lista.mostrar();
                    break;
                case 4:
                    System.out.print("Ingrese el valor a buscar: ");
                    lista.buscar(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Ingrese el valor a eliminar: ");
                    lista.eliminar(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}