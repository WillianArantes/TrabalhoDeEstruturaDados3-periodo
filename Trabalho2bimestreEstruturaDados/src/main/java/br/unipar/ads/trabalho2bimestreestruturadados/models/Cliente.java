
package br.unipar.ads.trabalho2bimestreestruturadados.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author willh
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Cliente {
    private String nome;
    private int senha;
    private int anoNascimento;
    
    
}
