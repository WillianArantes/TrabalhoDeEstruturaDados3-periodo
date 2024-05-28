
package br.unipar.ads.trabalho2bimestreestruturadados;

import br.unipar.ads.trabalho2bimestreestruturadados.models.Cliente;
import br.unipar.ads.trabalho2bimestreestruturadados.models.FilaAtendimento;
import javax.swing.JOptionPane;

/**
 *
 * @author willh
 */
public class SegundoExercicio {
    public static void main(String[] args){
        int numNovoCliente = 0;
        int contadorSenha = 0;
        boolean opcaoSair = true;
        
        FilaAtendimento filaPrioritaria = new FilaAtendimento(3);
        FilaAtendimento filaNormal = new FilaAtendimento(1);
        Cliente novoCliente = new Cliente();
        

        
        //criado para teste
        Cliente a = new Cliente();
        a.setNome("willian");
        a.setAnoNascimento(1999);
        filaPrioritaria.enqueue(a);
        
               
        
        
        //menu de opções
       
       String opcaoEscolhida;
       //menu de opções 
        
        JOptionPane.showMessageDialog(null,"Sistema de "
                + "Atendimento - Banco");
        opcaoEscolhida = JOptionPane.showInputDialog(null, 
                "Qual opção voce deseja: "
                        + "\n1 - Adicionar novo cliente"
                + "\n2 - Chamar próximo cliente"
        +"\n3 -Sair");
        
        switch(opcaoEscolhida){
            case "1":
                
                novoCliente.setNome(JOptionPane.showInputDialog(
                        "Informe o nome do cliente: "));
                String anoNascimento  = (JOptionPane.showInputDialog(
                        "Informe o ano de nasscimento do cliente: "));
                novoCliente.setAnoNascimento(Integer.parseInt(
                        anoNascimento));
                
                int idade = 2024 - novoCliente.getAnoNascimento();
                if(idade <= 65){
                    if(!filaNormal.isFull()){
                      filaNormal.enqueue(novoCliente);
                      JOptionPane.showMessageDialog(null, 
                              "cliente " + novoCliente.getNome()+" adicionado "
                                      + "a fila normal!");
                      contadorSenha++;
                      novoCliente.setSenha(contadorSenha);
                    }
                }else{
                    if(!filaPrioritaria.isFull()){
                    filaPrioritaria.enqueue(novoCliente);
                    JOptionPane.showMessageDialog(null, 
                              "cliente " + novoCliente.getNome()+" adicionado "
                                      + "a fila prioritaria");
                      contadorSenha++;
                      novoCliente.setSenha(contadorSenha);
                    }
                }
                break;
            case "2":
                int qtdPrioridade = 0;
                while(qtdPrioridade < 2){
                    if(!filaPrioritaria.isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Prox paciente com prioridade: \n" 
                                    + filaPrioritaria.dequeue());
                    qtdPrioridade ++;
                }
               }
                if(!filaNormal.isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Prox paciente sem prioridade: \n" 
                                    + filaNormal.dequeue());
                }
                case "3": 
                    opcaoSair = false;
                    break;
                 default:
                     JOptionPane.showMessageDialog(null, 
                             "Invalido, tente novamente!");
        }
    }
}
