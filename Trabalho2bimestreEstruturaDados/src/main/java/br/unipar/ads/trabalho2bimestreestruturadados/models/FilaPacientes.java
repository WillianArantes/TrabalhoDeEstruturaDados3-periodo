
package br.unipar.ads.trabalho2bimestreestruturadados.models;

import javax.management.ConstructorParameters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author willh
 */
@Getter
@Setter
@ToString
public class FilaPacientes {
    
    private String[] vetorPacientes;
    private int frente = 0;
    private int fim = -1;
    private int qtdPaciente = 0 ;

    public FilaPacientes(int tamanho) {
        vetorPacientes = new String[tamanho];
         
    }
    public FilaPacientes() {
        
    }

    //metodo pra inserir um paciente no final da fila(do vetor)
   public void enqueue(String novoPaciente){
       //verifica se o indice fim está no final do vetor
       if(fim == vetorPacientes.length -1){//verificar se a fila esta cheia
           //se fim for igual a ultima posição do vetor ele é redefinido para -1
           fim = -1;// vai receber ultima posicao 
       }
       // no vetor é incremetado o indice ++fim de -1 vai para 0
        // e adicionando a primeira posição o novo Paciente.
        //se nao vai adicionar normalmente a ultima posição.
       vetorPacientes[++fim] = novoPaciente;
       //após adicionar novo paciente ao comeco da fila, iremos adicionar a quantidade de pacientes.
       qtdPaciente++;
   }
   
   public String dequeue(){
     //armazenando na variavel aux o indice frente igual a 0 e incrementando após usala ficanod igual a 1.
       String nmPacienteNaVez = vetorPacientes[frente++];
      //se indice frente for igual a ultima posiçao do vetor, se chegar a ultima posição
      //se o paciente for o ultimo da lista. 
      if(frente == vetorPacientes.length){
        // no vetor é incremetado o indice ++fim de -1 vai para 0
        // e adicionando a ultima posição o
           frente = 0;
       }
       //indica que um paciente foi removido
       qtdPaciente--;
       
       return nmPacienteNaVez;
   }
    //Retorna verdadeiro se a fila estiver vazia
   public boolean isEmpty(){
       return qtdPaciente == 0;
   } 
   //retorna verdadeiro se a fila estiver cheia 
   public boolean isFull(){
        return qtdPaciente == vetorPacientes.length;
    }
}
