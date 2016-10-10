package topicos;
import java.util.InputMismatchException;
import java.util.Scanner;
/** Created by xtrs84zk on 06/10/2016. **/
public class TorresDeHanoi extends Hanoi {
    /** Método main. Se encarga de mostrar al usuario las instrucciones y colectar la cantidad de discos que se usará en el programa.
     * Llama al método Hanoi y le envía la cantidad de discos que debe usar, además del método de solución.
     * Si la excepción IllegalArgumentException es atrapada, la cantidad que introdujo el usuario no es válida.
     * Si la excepción InputMismatchException es atrapada, el usuario introdujo valores de tipo incorrecto.**/
    public static void main(String[] args) {
        int cantidad, opcion; //Declarar variables.
        cantidad = 0; //Inicializar variable cantidad
        Scanner entrada = new Scanner(System.in); //Inicializando objeto Scanner.
        System.out.println("Torres de Hanoi.");
        System.out.println("Para jugar, sólo necesito la cantidad de discos. Debe ser al menos 2.");
        do {
            System.out.println("¿De qué forma quieres que lo resuelva?");
            System.out.println("1. Recursiva        2. Iterativa");
            opcion = entrada.nextInt();
        } while (opcion != 1 && opcion != 2);
        do { //En caso de recibir un parámetro incorrecto, debe seguir pidiendo el valor.
            try { //El método Hanoi lanza excepciones, hay que estar preparados para atraparlas.
                System.out.print("¿Cuántos discos usaré? "); //Pidiendo al usuario la cantidad de discos.
                cantidad = entrada.nextInt(); // Almacenando la cantidad de discos.
                Hanoi(cantidad, opcion);//Llamada al método Hanoi.
            } catch (IllegalArgumentException e) { //La excepción IllegalArgumentException es atrapada.
                System.out.print("Necesito al menos dos discos para trabajar. ");
            } catch (InputMismatchException e) { //La excepción InputMismatchException es atrapada.
                System.out.print("Necesito un valor entero.");
                return; //Terminar el método main para evitar más errores.
            } catch (Exception e) { //Cualquier otra excepción es atrapada.
                System.out.println("Error desconocido: " + e);
                return; //Terminar el método main para evitar más errores.
            }
        } while (cantidad < 2); //La cantidad se seguirá pidiendo mientras se reciba una inválida.
    }
}