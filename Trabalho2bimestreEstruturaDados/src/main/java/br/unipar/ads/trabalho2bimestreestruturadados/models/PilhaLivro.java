
package br.unipar.ads.trabalho2bimestreestruturadados.models;

import java.util.ArrayList;
import javax.swing.JOptionPane;
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

public class PilhaLivro<String> {
    
    private String[]pilha;
    private int posicaoTopo;
    private ArrayList<Produto> produto;
    
    
    public PilhaLivro(int tamanho){
        pilha = (String[]) new Object[tamanho];
        posicaoTopo = -1;
       
       
    }

    public PilhaLivro(ArrayList<Produto> produto) {
        this.produto = produto;
    }
  
    //metodo para adicionar elemento ao topo da pilha
    public void push(String elemento){
        pilha[++posicaoTopo] = elemento;
    }
    //metodo para remover o elemento do topo da pilha
    public String pop(){
        return pilha[posicaoTopo--];//ultimo adicionado ao topo sera removido
        
    }
    //metodo para acessar o elemento do topo da pilha
    public String top(){
        return pilha[posicaoTopo];
    }
    public String listar(){
        String livro;
        livro = pilha[posicaoTopo--];
       return livro ;
    }
    //Retorna true se está vazio
    public boolean isEmpty(){
        return posicaoTopo == -1;//se o topo da pilha for a ultima posicao, está vazio
    }
    
    //Retorna true se estiver cheio
    public boolean isFull(){
        return posicaoTopo == pilha.length-1;
    }
}
    