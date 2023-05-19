package Roleta;

public class RoletaPremio {
    
  public void adicionarNome(String premio) {
 
  }
  
  public void removerPremio(String nome) {


    if (estaVazia()) {
      System.out.println("A lista está vazia.");
      return;
  }
  No noAtual = primeiroNo;
  No noAnterior = null;
  boolean encontrado = false;

  do {
      if (noAtual.getPremio().getNome().equals(nome)) {
          encontrado = true;
          break;
      }
      noAnterior = noAtual;
      noAtual = noAtual.getProximo();
  } while (noAtual != primeiroNo);

  if (encontrado) {
      if (noAtual == primeiroNo && tamanho == 1) {
          primeiroNo = null;
      } else if (noAtual == primeiroNo) {
          noAnterior.setProximo(noAtual.getProximo());
          primeiroNo = noAnterior.getProximo();
      } else {
          noAnterior.setProximo(noAtual.getProximo());
      }
      tamanho--;
      System.out.println("O prêmio \"" + nome + "\" foi removido.");
  } else {
      System.out.println("O prêmio \"" + nome + "\" não foi encontrado.");
  }
}


  }
public void alterarPremio(String antigo, String novo) {
   {
    if (estaVazia()) {
        System.out.println("A lista está vazia.");
        return;
    }
    No noAtual = primeiroNo;
    boolean encontrado = false;

    do {
        if (noAtual.getPremio().getNome().equals(nomeAntigo)) {
            encontrado = true;
            break;
        }
        noAtual = noAtual.getProximo();
    } while (noAtual != primeiroNo);

    if (encontrado) {
        noAtual.getPremio().nome = nomeNovo;
        System.out.println("O prêmio foi alterado para \"" + nomeNovo + "\".");
    } else {
        System.out.println("O prêmio \"" + nomeAntigo + "\" não foi encontrado.");


}
public int totalPremios() {
    return 0;


} 

public void verPremios() {
    
}
}
