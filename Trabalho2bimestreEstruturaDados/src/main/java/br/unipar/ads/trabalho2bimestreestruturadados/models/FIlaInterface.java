
package br.unipar.ads.trabalho2bimestreestruturadados.models;

/**
 *
 * @author willh
 */
public interface FIlaInterface {
    public void enqueue(Cliente novoCliente);
    public Cliente dequeue();
    public boolean isEmpty();
    public boolean isFull();
    
    
}
