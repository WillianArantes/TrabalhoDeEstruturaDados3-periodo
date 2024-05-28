
package br.unipar.ads.trabalho2bimestreestruturadados.models;

import javax.swing.JOptionPane;
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
@AllArgsConstructor
@NoArgsConstructor
         
public class Produto {
    private String codProduto;
    private String descricao;
    private String dataEntrada;
    private String ufOrigem;
    private String ufDestino;
  

}
