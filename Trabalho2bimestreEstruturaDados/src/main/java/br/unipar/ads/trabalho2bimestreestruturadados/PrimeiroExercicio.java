//1 - Uma clínica precisa de um sistema para organizar a fila de pacientes, para cada dia
//é disponibilizado 20 senhas para consulta. Eles necessitam de um sistema onde é
//informado o nome do paciente em ordem de chegada e uma opção para chamar o
//próximo paciente. Desenvolva um algoritmo de Fila, contendo um menu com as
//opções: 1 - Adicionar paciente, 2 - Chamar próximo paciente. A opção 1 deverá exibir
//um campo para informar o nome do paciente assim que ele chega no consultório, e a
//opção 2, ao selecionar deverá exibir o nome do próximo paciente na fila.

package br.unipar.ads.trabalho2bimestreestruturadados;

import br.unipar.ads.trabalho2bimestreestruturadados.models.FilaPacientes;
import javax.swing.JOptionPane;


public class PrimeiroExercicio {

    public static void main(String[] args) {
           
       FilaPacientes filaPacientes = new FilaPacientes(20);
       //criado dois pacientes para realiar teste 
       filaPacientes.enqueue("willian");
       filaPacientes.enqueue("joao");
       boolean opcaoSair = true;
       
       
       
       String opcaoEscolhida;
       //menu de opções 
        JOptionPane.showMessageDialog(null,"Sistema de "
                + "Consultas - Clinica");
        opcaoEscolhida = JOptionPane.showInputDialog(null, 
                "Qual opção voce deseja: "
                        + "\n1 - Adicionar novo paciente"
                + "\n2 - Chamar próximo paciente"
        +"\n3 - Sair");
        
        switch(opcaoEscolhida){
            
            case "1":
                if(!filaPacientes.isFull()){
                //adicionar um novo paciente
                String novoPaciente = JOptionPane.showInputDialog(
                        "Informe o nome do paciente: ");
                if(!filaPacientes.isFull()){
                    filaPacientes.enqueue(novoPaciente);
                    JOptionPane.showMessageDialog(null, 
                            "Paciente " + novoPaciente + " adicionado a fila!");
                
                }
                }break;
            case "2":
                
                if(!filaPacientes.isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Prox paciente: \n" + filaPacientes.dequeue());
                }break;
                case "3": 
                    opcaoSair = false;
                    break;
                 default:
                     JOptionPane.showMessageDialog(null, 
                             "Invalido, tente novamente!");
        }
    }
        
}
