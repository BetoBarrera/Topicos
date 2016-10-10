package aplicacion.Topicos;

/** Created on 09/10/2016. **/
public class Hanoi {
    /** M�todo que recibe la cantidad de discos con los que se plantea resolver.
     * Llama al m�todo recursivo en caso de que el n�mero sea valido.
     * Si la cantidad es insuficiente (menor a dos) lanzar� una excepci�n del tipo IllegalArgumentsException.
     * En caso de recibir una letra o alg�n valor que no sea del tipo int, lanzar� la excepci�n InputMismatchException. **/
    public void Hanoi(int cantidad) throws Exception{
        if(cantidad >= 2) {
            System.out.println("Los movimientos a realizar son: ");
            int columna1 = 1; //Aqu� es donde est�n todos los discos al inicio.
            int columna2 = 2; //Esta es la columna auxiliar que se utilizar� para mover los discos.
            int columna3 = 3; //Esta es la columna de destino, a donde se planea mover los discos.
            HanoiRecursivo(cantidad, columna1, columna2, columna3); //M�todo recursivo.
            System.out.println("Usando esos movimientos, podr�s resolverlo. ;) ");
            return;
        }
        //En caso de que la cantidad no cumpla los requisitos, se lanzar� una excepci�n
        throw new IllegalArgumentException("El usuario introdujo una cantidad menor a dos.");
    }
    /** M�todo recursivo encargado de mostrar los movimientos necesarios para
     * resolver "las torres de Hanoi" con el n�mero de discos recibido.
     * Se mueve el disco siguiendo la l�gica: columna actual () hacia la pila de destino.
     * Haber llamado al m�todo recursivo decrementando el n�mero de disco asegura que, al final,
     * llegar� al caso base; esto es, que habr� s�lo un disco que mover cada vez.
     * Los discos pares se mueven en una direcci�n, los impares en otra.
     * Recibe el n�mero de discos, la pila de origen, la  pila auxiliar y la pila de destino.**/
    private void HanoiRecursivo(int n, int origen,  int auxiliar, int destino) {
        if (n == 1) { //Caso base
            System.out.println("Mueve el disco que est� en la pila " + origen + " a la pila " + destino + ".");
        }
        else { //Caso recursivo
            HanoiRecursivo(n - 1, origen, destino, auxiliar);
            //Llamar al m�todo recursivo con exactamente la misma informaci�n, s�lo que con un disco debajo en el origen.
            System.out.println("Mueve el disco que est� en la pila " + origen + " a la pila " + destino + ".");
            //Muestra en un mensaje hacia donde mover� el disco dependiendo de los paramtetros dados.
            HanoiRecursivo(n - 1, auxiliar, origen, destino);
            //Llamar al m�todo recursivo dici�ndole que mueva el disco inferior de la columna auxiliar a la tercera.
        }
    }
}
