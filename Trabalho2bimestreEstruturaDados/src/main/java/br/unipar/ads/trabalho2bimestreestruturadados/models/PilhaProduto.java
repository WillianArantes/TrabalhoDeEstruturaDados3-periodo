
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

public class PilhaProduto<Produto> {
    
    private Produto[]pilha;
    private int posicaoTopo;
    
    
    public PilhaProduto(int tamanho){
        pilha = (Produto[]) new Object[tamanho];
        posicaoTopo = -1;       
    }

    //metodo para adicionar elemento ao topo da pilha
    public void push(Produto elemento){
        pilha[++posicaoTopo] = elemento;
    }
    //metodo para remover o elemento do topo da pilha
    public Produto pop(){
        return pilha[posicaoTopo--];//ultimo adicionado ao topo sera removido
        
    }
    //metodo para acessar o elemento do topo da pilha
    public void top(){
       JOptionPane.showMessageDialog(null, pilha[posicaoTopo]);
    }
    public Produto listar(){
        Produto produto;
        produto = pilha[posicaoTopo--];
       return produto ;
    }
    
    //Retorna true se está vazio
    public boolean isEmpty(){
        return posicaoTopo == -1;//se o topo da pilha for a ultima posicao, está vazio
    }
    
    //Retorna true se estiver cheio
    public boolean isFull(){
        return posicaoTopo == pilha.length-1;
    }
    public void exibirProdutos() {
    JOptionPane.showMessageDialog(null, 
            "Produtos aguardando a serem despachados: ");
    
    int index = posicaoTopo; // Salva a posição do topo da pilha
    
    while (index >= 0 && pilha[index] != null) {
        JOptionPane.showMessageDialog(null, pilha[index]);
        index--; // Decrementa o índice
    }
}

}
    