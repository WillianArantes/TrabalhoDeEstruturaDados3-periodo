//Uma empresa de transportes precisa controlar o fluxo de produtos no seu depósito. Para auxiliar
//na organização,
//as caixas são empilhadas no máximo 10 caixas. Quando vão despachar o produto, a empilhadeira
//sempre retira e adiciona caixas
//em cima da pilha. Eles necessitam que seja exibido no painel quais produtos estão aguardando o
//despache em ordem, e no momento de retirada da caixa, qual produto está sendo despachado.
//Obs: no painel sempre depois de cada ação, mostra a posição atual da pilha, ou seja, quais
//produtos estão na pilha.
//Produto
//- codProduto
//- descricao
//- dataEntrada
//- ufOrigem
//- ufDestino
//10 posições - caixas
//exibir = no painel: os produtos que estao agurdando na pilha, exibir em ordem de cima pra baixo
//sempre depois de casa acao(retirar ou adicionar), mostrar a posição de cada produto na pilha
package br.unipar.ads.trabalho2bimestreestruturadados;

import br.unipar.ads.trabalho2bimestreestruturadados.models.PilhaLivro;
import br.unipar.ads.trabalho2bimestreestruturadados.models.PilhaProduto;
import br.unipar.ads.trabalho2bimestreestruturadados.models.Produto;
import java.awt.DisplayMode;
import javax.swing.JOptionPane;

/**
 *
 * @author willh
 */
public class QuartoExercicio {
    
    public static void main(String[] args){
        
        boolean opcaoSair  = true;
        String opcaoEscolhida;
        int tamanhopilha = 10;
        
        
        Produto produto = new Produto();
        
        Produto tenis = new Produto("1", "Produto 1", 
                "01/01/2024", "RJ", "SP");
        Produto sapato = new Produto("2", "Produto 2", 
                "02/01/2024", "SP", "RJ");
        Produto sandalia = new Produto("3", "Produto 3", 
                "03/01/2024", "MG", "ES");
        Produto blusa = new Produto("4", "Produto 4", 
                "04/01/2024", "ES", "MG");
        
        PilhaProduto produtos = new PilhaProduto(tamanhopilha);
        
        //produtos criados como exemplo 
        produtos.push(tenis);
        produtos.push(sapato);
        produtos.push(sandalia);
        produtos.push(blusa);
    
        JOptionPane.showMessageDialog(null, "Sistema para "
                + " Controle de fluxo do deposito");
  
        
        produtos.exibirProdutos();

        while(opcaoSair){
             opcaoEscolhida =  JOptionPane.showInputDialog("Informe a opção "
                     + "desejada: "
                     + "\n1 - Adicionar produto"
                     + "\n2 - Despachar produto"
                     + "\n3 - Visualizar produtos"
                     + "\n4 - Sair");
     
        switch(opcaoEscolhida){
                case "1":

                    if(!produtos.isFull()){
                    Produto novoProduto = new Produto();
                    
                    novoProduto.setCodProduto(JOptionPane.showInputDialog(
                            "Informe o codigo do produto:"));
                    novoProduto.setDataEntrada(JOptionPane.showInputDialog(
                            "Informe o data do produto:"));
                    novoProduto.setDescricao(JOptionPane.showInputDialog(
                            "Informe a descrição do produto:"));
                    novoProduto.setUfDestino(JOptionPane.showInputDialog(
                            "Informe a UF destino do produto:"));
                    novoProduto.setUfOrigem(JOptionPane.showInputDialog(
                            "Informe a UF origem do produto: "));
                    
                    produtos.push(novoProduto);
                    }else{
                        JOptionPane.showMessageDialog(null, 
                                "A pilha de produtos está cheia! "
                                        + "primeiro despache "
                                        + "para poder inserir");
                    }
                        produtos.exibirProdutos();

                    break;
                case "2":
                    produtos.top();
                    if(!produtos.isEmpty()){
                    produtos.pop();
                    }
                    produtos.exibirProdutos();
                case "3":
                    JOptionPane.showMessageDialog(null, 
                         "PRODUTOS PARA DESPACHAR: ");
                    produtos.exibirProdutos();
                case "4":
                    opcaoSair = false;
                    default:
                                   JOptionPane.showMessageDialog(null, 
                                           "Invalido, tente novamente!");
        }
        }}
}
