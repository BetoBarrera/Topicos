package aplicacion;
import java.util.InputMismatchException;
import java.util.Scanner;
/** Created by xtrs84zk on 06/10/2016. **/
public class TorresDeHanoi {
    /** M�todo main. Se encarga de mostrar al usuario las instrucciones y colectar la cantidad de discos que se usar� en el programa.
     * Llama al m�todo Hanoi y le env�a la cantidad de discos que debe usar.
     * Si la excepci�n IllegalArgumentException es atrapada, la cantidad que introdujo el usuario no es v�lida.
     * Si la excepci�n InputMismatchException es atrapada, el usuario introdujo valores de tipo incorrecto.**/
    public static void main(String[] args) {
        int cantidad = 0; //Declarar e inicializar la variable cantidad, que es la cantidad de discos.
        Scanner entrada = new Scanner(System.in); //Inicializando objeto Scanner.
        System.out.println("Torres de Hanoi.");
        System.out.println("Para jugar, s�lo necesito la cantidad de discos. Debe ser al menos 2.");
            do { //En caso de recibir un par�metro incorrecto, debe seguir pidiendo el valor.
                try { //El m�todo Hanoi lanza excepciones, hay que estar preparados para atraparlas.
                    System.out.print("�Cu�ntos discos usar�? "); //Pidiendo al usuario la cantidad de discos.
                    cantidad = entrada.nextInt(); // Almacenando la cantidad de discos.
                    Hanoi(cantidad); //Llamada al m�todo Hanoi().
                } catch (IllegalArgumentException e) { //La excepci�n IllegalArgumentException es atrapada.
                    System.out.print("Necesito al menos dos discos para trabajar. ");
                } catch (InputMismatchException e) { //La excepci�n InputMismatchException es atrapada.
                    System.out.print("Necesito un valor entero.");
                    return; //Terminar el m�todo main para evitar m�s errores.
                } catch (Exception e) { //Cualquier otra excepci�n es atrapada.
                    System.out.println("Error desconocido: " + e);
                    return; //Terminar el m�todo main para evitar m�s errores.
                }
            } while (cantidad < 2); //La cantidad se seguir� pidiendo mientras se reciba una inv�lida.
    }
}