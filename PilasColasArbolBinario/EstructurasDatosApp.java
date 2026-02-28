import java.util.Scanner;

//Nodo para listas
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

//Pila (Stack)

class Pila {
    private Nodo cima;

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Elemento agregado a la pila.");
    }

    public void pop() {
        if (cima == null) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elemento eliminado: " + cima.dato);
            cima = cima.siguiente;
        }
    }

    public void mostrar() {
        Nodo actual = cima;
        if (actual == null) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos de la pila:");
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }
}

//Cola (Queue)
class Cola {
    private Nodo frente, fin;

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        System.out.println("Elemento agregado a la cola.");
    }

    public void dequeue() {
        if (frente == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elemento eliminado: " + frente.dato);
            frente = frente.siguiente;
            if (frente == null) {
                fin = null;
            }
        }
    }

    public void mostrar() {
        Nodo actual = frente;
        if (actual == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elementos de la cola:");
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }
}

//Arbol Binario 

class NodoArbol {
    int dato;
    NodoArbol izquierdo, derecho;

    public NodoArbol(int dato) {
        this.dato = dato;
        izquierdo = null;
        derecho = null;
    }
}

class ArbolBinario {
    Scanner entrada = new Scanner(System.in);
    NodoArbol raiz;

    public NodoArbol crearNodo() {
        System.out.print("Ingrese el dato del nodo: ");
        int dato = entrada.nextInt();
        NodoArbol nodo = new NodoArbol(dato);

        System.out.print("¿Desea agregar hijo izquierdo de " + dato + "? (s/n): ");
        char respIzq = entrada.next().charAt(0);
        if (respIzq == 's' || respIzq == 'S') {
            nodo.izquierdo = crearNodo();
        }

        System.out.print("¿Desea agregar hijo derecho de " + dato + "? (s/n): ");
        char respDer = entrada.next().charAt(0);
        if (respDer == 's' || respDer == 'S') {
            nodo.derecho = crearNodo();
        }

        return nodo;
    }

    public void crearArbol() {
        raiz = crearNodo();
    }
    //PREORDEN (Raíz - Izquierda - Derecha)
    public void preOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    //INORDEN (Izquierda - Raíz - Derecha)
    public void inOrden(NodoArbol nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inOrden(nodo.derecho);
        }
    }

    //POSTORDEN (Izquierda - Derecha - Raíz)
    public void postOrden(NodoArbol nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    public void mostrar() {
        if (raiz==null) {
            System.out.println("El arbol esta vacio ");
        }
        System.out.println("\nRecorrido PreOrden:");
        preOrden(raiz);

        System.out.println("\nRecorrido InOrden:");
        inOrden(raiz);

        System.out.println("\nRecorrido PostOrden:");
        postOrden(raiz);

        System.out.println();
    }
}

//Menu principal

public class EstructurasDatosApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n   MENÚ PRINCIPAL ");
            System.out.println("1. Operaciones con Pila");
            System.out.println("2. Operaciones con Cola");
            System.out.println("3. Crear Arbol Binario");
            System.out.println("4. Mostrar recorido arbol");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n1. Push\n2. Pop\n3. Mostrar");
                    int opPila = entrada.nextInt();
                    if (opPila == 1) {
                        System.out.print("Ingrese dato: ");
                        pila.push(entrada.nextInt());
                    } else if (opPila == 2) {
                        pila.pop();
                    } else if (opPila == 3) {
                        pila.mostrar();
                    }
                    break;

                case 2:
                    System.out.println("\n1. Enqueue\n2. Dequeue\n3. Mostrar");
                    int opCola = entrada.nextInt();
                    if (opCola == 1) {
                        System.out.print("Ingrese dato: ");
                        cola.enqueue(entrada.nextInt());
                    } else if (opCola == 2) {
                        cola.dequeue();
                    } else if (opCola == 3) {
                        cola.mostrar();
                    }
                    break;

                case 3:
                    System.out.println("Creando árbol binario...");
                    arbol.crearArbol();
                    break;

                case 4:
                    arbol.mostrar();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}