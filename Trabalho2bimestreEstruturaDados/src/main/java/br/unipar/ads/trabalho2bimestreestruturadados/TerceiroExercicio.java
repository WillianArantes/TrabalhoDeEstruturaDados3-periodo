//3 - Desenvolva um algoritmo para controlar uma pilha de livros de uma biblioteca. 
//Deverá conter um método para adicionar o livro a pilha,
//Um método para listar os livros da pilha, um método para retirar o livro da pilha, nesse último
//método deverá ser exibido qual livro está sendo removido. Crie um menu para exibir as opções.

package br.unipar.ads.trabalho2bimestreestruturadados;

import br.unipar.ads.trabalho2bimestreestruturadados.models.PilhaLivro;
import javax.swing.JOptionPane;

/**
 *
 * @author willh
 */
public class TerceiroExercicio {
    public static void main(String[]args){
        String opcaoEscolhida;
        int tamanhopilha = 3;
        PilhaLivro pilhaLivros = new PilhaLivro(tamanhopilha);
        boolean opcaoSair = true;
        
        
       
        JOptionPane.showMessageDialog(null, "Sistema para "
                + " Biblioteca");
        while(opcaoSair){
             opcaoEscolhida =  JOptionPane.showInputDialog("Informe a opção "
                     + "desejada: "
                     + "\n1 - Adicionar livro"
                     + "\n2 - Listar livros"
                     + "\n3 - Remover livro"
                     + "\n4 - Sair");
        
            switch(opcaoEscolhida){
                case "1":
                    if(!pilhaLivros.isFull()){
                    String livro;
                    livro = JOptionPane.showInputDialog("Informe o livro que deseja  "
                            + "adicionar: ");
                    pilhaLivros.push(livro);
                    JOptionPane.showMessageDialog(null, "Livro "
                    + livro + " adicionado!");
                    }
                    break;
                     case "2":
                         String livros = "Lista com todos os livros: \n";
                         for(int i = 0; i < tamanhopilha; i++){

                             livros += pilhaLivros.listar();
                         }
                         break;
                          case "3":
                              if(!pilhaLivros.isEmpty()){
                              JOptionPane.showMessageDialog(null, 
                                      "Livro removido: " + pilhaLivros.top());
                              pilhaLivros.pop();
                              }
                              break;
                               case "4": 
                                   opcaoSair = false;
                                   break;
                               default:
                                   JOptionPane.showMessageDialog(null, 
                                           "Invalido, tente novamente!");
                                   
            }
        
        }   
        
     
    }
}
