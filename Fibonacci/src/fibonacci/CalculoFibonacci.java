
package fibonacci;

public class CalculoFibonacci {
    
  public long fibonacci(long numero){
        if((numero == 0) || (numero == 1))
        return numero;
        else // paso recursivo
        return fibonacci (numero - 1) + fibonacci (numero -  2); 
    } // fin metodo fibonacci
  int fibona =9;
    public void mostrarFibonacci() {
        for(int contador = 0; contador < fibona ; contador++)
        System.out.printf("Fibonacci de %d es: %d\n", contador,fibonacci(contador));
    } // fin metodo mostrarfibonacci 
}
