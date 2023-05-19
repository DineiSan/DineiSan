class ListaLigadaCircular {
    private No primeiroNo;
    private int tamanho;

    public ListaLigadaCircular() {
        primeiroNo = null;
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
            primeiroNo = novoNo;
            primeiroNo.setProximo(primeiroNo);
        } else {
            No ultimoNo = primeiroNo;
            while (ultimoNo.getProximo() != primeiroNo) {
                ultimoNo = ultimoNo.getProximo();
            }
            ultimoNo.setProximo(novoNo);
            novoNo.setProximo(primeiroNo);
        }
        tamanho++;
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

    public void alterarPremio(String nomeAntigo, String nomeNovo) {
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
    }
}
