import br.unipar.ads.trabalho2bimestreestruturadados.models.PilhaProduto;
import br.unipar.ads.trabalho2bimestreestruturadados.models.Produto;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class GerenciarDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaProduto[] pilhas = new PilhaProduto[5];

        // Inicializa as 5 pilhas
        for (int i = 0; i < pilhas.length; i++) {
            pilhas[i] = new PilhaProduto(10);
        }
       
        boolean continuar = true;

        while (continuar) {
           
            String escolha = JOptionPane.showInputDialog(null, 
                    "Adicionar Produto " + "Remover Produto" + 
                "Exibir Pilhas " + "Sair \n" + "Escolha uma ação " +
                "Gerenciar Depósito");
            
            switch (escolha) {
                case "0": // Adicionar Produto
                    int pilhaAdicionar = selecionarPilha();
                    if (pilhaAdicionar != -1 && !pilhas[pilhaAdicionar].isFull()) {
                        Produto novoProduto = criarProduto(scanner);
                        pilhas[pilhaAdicionar].push(novoProduto);
                        JOptionPane.showMessageDialog(null, 
                                "Produto adicionado na pilha " + (pilhaAdicionar + 1));
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "Pilha selecionada está cheia ou inválida.");
                    }
                    break;

                case "1": // Remover Produto
                    int pilhaRemover = selecionarPilha();
                    if (pilhaRemover != -1 && !pilhas[pilhaRemover].isEmpty()) {
                        Produto produtoRemovido = (Produto) pilhas[pilhaRemover].pop();
                        JOptionPane.showMessageDialog(null, 
                                "Produto removido da pilha " + (pilhaRemover + 1)
                                        + ": " + produtoRemovido);
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "Pilha selecionada está vazia ou inválida.");
                    }
                    break;

                
                case "3": // Sair
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, 
                            "Ação inválida.");
                    break;
            }
        }
    }

    private static int selecionarPilha() {
        String input = JOptionPane.showInputDialog(
                "Selecione a pilha (1-5):");
        try {
            int pilha = Integer.parseInt(input);
            if (pilha < 1 || pilha > 5) {
                throw new NumberFormatException();
            }
            return pilha - 1;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Entrada inválida. Selecione um número entre 1 e 5.");
            return -1;
        }
    }

    private static Produto criarProduto(Scanner scanner) {
        String codigo = (JOptionPane.showInputDialog("Código do produto:"));
        String descricao = JOptionPane.showInputDialog("Descrição do produto:");
        String dataEntrada = JOptionPane.showInputDialog("Data de entrada:");
        String ufOrigem = JOptionPane.showInputDialog("UF de origem:");
        String ufDestino = JOptionPane.showInputDialog("UF de destino:");

        return new Produto(codigo, descricao, dataEntrada, ufOrigem, ufDestino);
    }

    
}

