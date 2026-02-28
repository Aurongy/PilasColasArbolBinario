
import java.util.Queue;
import java.util.LinkedList;

public class ColaEjemplo {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        System.out.println("Colas: " + cola);

        // Agregar elementos
        cola.add("Juan");
        cola.add("María");
        cola.add("Pedro");

        System.out.println("Cola: " + cola);

        // Eliminar el primero
        cola.poll();

        System.out.println("Cola después de eliminar: " + cola);

        // Ver el primero sin eliminar
        System.out.println("Primero en la cola: " + cola.peek());
    }
}
