
package br.unipar.ads.trabalho2bimestreestruturadados.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author willh
 */
@Setter
@Getter
@ToString

public class FilaAtendimento implements FIlaInterface{
    private Cliente[] vetor1clientes;
    private int frente;
    private int fim;
    private int qtdItens; 
    
    public FilaAtendimento(int tamanho){
        vetor1clientes = new Cliente[tamanho];
        frente = 0;
        fim = -1;
        qtdItens = 0;
    }
    public FilaAtendimento(){
       
    }
    

    @Override
    public void enqueue(Cliente novoCliente) {
         if(fim == vetor1clientes.length -1){
             fim = -1;
         }
         vetor1clientes[++fim] = novoCliente;
         qtdItens ++;
    }

    @Override
    public Cliente dequeue() {
        Cliente clienteDaVez = vetor1clientes[frente++];
        //se o paciente for o ultimo da lista
        if(frente == vetor1clientes.length){
            //inserimos ele como primeiro a lista
            frente = 0;
        }
        qtdItens --;
        return clienteDaVez;
        
    }

    @Override
    public boolean isEmpty() {
       return qtdItens == 0;
    }

    @Override
    public boolean isFull() {
        return qtdItens == vetor1clientes.length;
    }

    

    
}
