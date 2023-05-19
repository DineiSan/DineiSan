package Roleta;

public class Teste {
    
}
import java.util.Scanner;

class Premio {
    private String nome;

    public Premio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class No {
    private Premio premio;
    private No proximo;

    public No(Premio premio) {
        this.premio = premio;
    }

    public Premio getPremio() {
        return premio;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}

class ListaLigadaCircular {
    private No cabeca;
    private int tamanho;

    public ListaLigadaCircular() {
        cabeca = null;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarPremio(Premio premio) {
        No novoNo = new No(premio);
        if (estaVazia()) {
            cabeca = novoNo;
            cabeca.setProximo(cabeca);
        } else {
            No ultimoNo = cabeca;
            while (ultimoNo.getProximo() != cabeca) {
                ultimoNo = ultimoNo.getProximo();
            }
            ultimoNo.setProximo(novoNo);
            novoNo.setProximo(cabeca);
        }
        tamanho++;
    }

    public void removerPremio(String nome) {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }
        No noAtual = cabeca;
        No noAnterior = null;
        boolean encontrado = false;

        do {
            if (noAtual.getPremio().getNome().equals(nome)) {
                encontrado = true;
                break;
            }
            noAnterior = noAtual;
            noAtual = noAtual.getProximo();
        } while (noAtual != cabeca);

        if (encontrado) {
            if (noAtual == cabeca && tamanho == 1) {
                cabeca = null;
            } else if (noAtual == cabeca) {
                noAnterior.setProximo(noAtual.getProximo());
                cabeca = noAnterior.getProximo();
            } else {
                noAnterior.setProximo(noAtual.getProximo());
            }
            tamanho--;
            System.out.println("O prêmio \"" + nome + "\" foi removido.");
        } else {
            System.out.println("O prêmio \"" + nome + "\" não foi encontrado.");
        }
    }

    public void alterarPremio(String nomeAntigo, String nomeNovo) {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }
        No noAtual = cabeca;
        boolean encontrado = false;

        do {
            if (noAtual.getPremio().getNome().equals(nomeAntigo)) {
                encontrado = true;
                break;
            }
            noAtual = noAtual.getProximo();
        } while (noAtual != cabeca);

        if (encontrado) {
            noAtual.getPremio().nome = nomeNovo;
            System.out.println("O prêmio foi alterado para \"" + nomeNovo + "\".");
        } else {
            System.out.println("O prêmio \"" + nomeAntigo + "\" não foi encontrado.");




           // VERSÃO 2

           import java.util.Scanner;

           class Premio {
               private String nome;
           
               public Premio(String nome) {
                   this.nome = nome;
               }
           
               public String getNome() {
                   return nome;
               }
           }
           
           class No {
               private Premio premio;
               private No proximo;
           
               public No(Premio premio) {
                   this.premio = premio;
               }
           
               public Premio getPremio() {
                   return premio;
               }
           
               public No getProximo() {
                   return proximo;
               }
           
               public void setProximo(No proximo) {
                   this.proximo = proximo;
               }
           }
           
           class ListaLigadaCircular {
               private No cabeca;
               private int tamanho;
           
               public ListaLigadaCircular() {
                   cabeca = null;
                   tamanho = 0;
               }
           
               public boolean estaVazia() {
                   return tamanho == 0;
               }
           
               public int getTamanho() {
                   return tamanho;
               }
           
               public void adicionarPremio(Premio premio) {
                   No novoNo = new No(premio);
                   if (estaVazia()) {
                       cabeca = novoNo;
                       cabeca.setProximo(cabeca);
                   } else {
                       No ultimoNo = cabeca;
                       while (ultimoNo.getProximo() != cabeca) {
                           ultimoNo = ultimoNo.getProximo();
                       }
                       ultimoNo.setProximo(novoNo);
                       novoNo.setProximo(cabeca);
                   }
                   tamanho++;
               }
           
               public void removerPremio(String nome) {
                   if (estaVazia()) {
                       System.out.println("A lista está vazia.");
                       return;
                   }
                   No noAtual = cabeca;
                   No noAnterior = null;
                   boolean encontrado = false;
           
                   do {
                       if (noAtual.getPremio().getNome().equals(nome)) {
                           encontrado = true;
                           break;
                       }
                       noAnterior = noAtual;
                       noAtual = noAtual.getProximo();
                   } while (noAtual != cabeca);
           
                   if (encontrado) {
                       if (noAtual == cabeca && tamanho == 1) {
                           cabeca = null;
                       } else if (noAtual == cabeca) {
                           noAnterior.setProximo(noAtual.getProximo());
                           cabeca = noAnterior.getProximo();
                       } else {
                           noAnterior.setProximo(noAtual.getProximo());
                       }
                       tamanho--;
                       System.out.println("O prêmio \"" + nome + "\" foi removido.");
                   } else {
                       System.out.println("O prêmio \"" + nome + "\" não foi encontrado.");
                   }
               }
           
               public void alterarPremio(String nomeAntigo, String nomeNovo) {
                   if (estaVazia()) {
                       System.out.println("A lista está vazia.");
                       return;
                   }
                   No noAtual = cabeca;
                   boolean encontrado = false;
           
                   do {
                       if (noAtual.getPremio().getNome().equals(nomeAntigo)) {
                           encontrado = true;
                           break;
                       }
                       noAtual = noAtual.getProximo();
                   } while (noAtual != cabeca);
           
                   if (encontrado) {
                       noAtual.getPremio().nome = nomeNovo;
                       System.out.println("O prêmio foi alterado para \"" + nomeNovo + "\".");
                   } else {
                       System.out.println("O prêmio \"" + nomeAntigo + "\" não foi encontrado.");
           // VERSÃO 3

           import java.util.Scanner;

public class RoletaDigital {
    public static void main(String[] args) {
        ListaLigadaCircular roleta = new ListaLigadaCircular();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("---- Roleta Digital ----");
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
                    scanner.nextLine(); // Limpa o buffer do scanner
                    String nomePremio = scanner.nextLine();
                    Premio premio = new Premio(nomePremio);
                    roleta.adicionarPremio(premio);
                    System.out.println("O prêmio \"" + nomePremio + "\" foi adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o nome do prêmio a ser removido: ");
                    scanner.nextLine(); // Limpa o buffer do scanner
                    String nomeRemover = scanner.nextLine();
                    roleta.removerPremio(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do prêmio a ser alterado: ");
                    scanner.nextLine(); // Limpa o buffer do scanner
                    String nomeAntigo = scanner.nextLine();
                    System.out.print("Digite o novo nome do prêmio: ");
                    String nomeNovo = scanner.nextLine();
                    roleta.alterarPremio(nomeAntigo, nomeNovo);
                    break;
                case 4:
                    System.out.println("Total de prêmios na roleta: " + roleta.getTamanho());
                    break;
                case 5:
                    if (roleta.estaVazia()) {
                        System.out.println("A roleta está vazia.");
                    } else {
                        int indiceSorteado = (int) (Math.random() * roleta.getTamanho());
                        No noAtual = roleta.cabeca;
                        for (int i = 0; i < indiceSorteado; i++) {
                            noAtual = noAtual.getProximo();
                        }
                        System.out.println("O prêmio sorteado é: " + noAtual.getPremio().getNome());
                    }
                    break;
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
