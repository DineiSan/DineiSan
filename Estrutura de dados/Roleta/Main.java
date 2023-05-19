package Roleta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
RoletaPremio roleta = new RoletaPremio();
        Scanner scanner = new Scanner(System.in) ;

      int opcao;
      do{

        System.out.println("---- Roleta ----");
        System.out.println("1. Adicionar prêmio");
        System.out.println("2. Remover prêmio");
        System.out.println("3. Alterar prêmio");
        System.out.println("4. Ver total de prêmios da roleta");
        System.out.println("5. Rodar a roleta e sortear um prêmio");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do prêmio a ser adicionado: ");
                scanner.nextLine();
                String nomePremio = scanner.nextLine();
                Premio premio = new Premio(nomePremio);
                roleta.adicionarNome(nomePremio);
                System.out.println("O prêmio \"" + nomePremio + "\" foi adicionado.");
                break;
            case 2:
                System.out.print("Digite o nome do prêmio a ser removido: ");
                scanner.nextLine(); 
                String nomeRemover = scanner.nextLine();
                roleta.removerPremio(nomeRemover);
                break;
            case 3:
                System.out.print("Digite o nome do prêmio a ser alterado: ");
                scanner.nextLine(); 
                String nomeAntigo = scanner.nextLine();
                System.out.print("Digite o novo nome do prêmio: ");
                String nomeNovo = scanner.nextLine();
                roleta.alterarPremio(nomeAntigo, nomeNovo);
                break;
            /*case 4:
                System.out.println("Total de prêmios na roleta: " + roleta.getTamanho());
                break; */
           /*   case 5:
                if (roleta.estaVazia()) {
                    System.out.println("A roleta está vazia.");
                } else {
                    int indiceSorteado = (int) (Math.random() * roleta.getTamanho());
                    No noAtual = roleta.primeiroNo;
                    for (int i = 0; i < indiceSorteado; i++) {
                        noAtual = noAtual.getProximo();
                    }
                    System.out.println("O prêmio sorteado é: " + noAtual.getPremio().getNome());
                }
                break; */
            case 0:
                System.out.println("Encerrando o programa.");
                break;
            default:
                System.out.println("Opção inválida. Digite novamente.");
        }
        System.out.println();
    } while (opcao != 0);

    scanner.close();
}
}
