package TabuleiroJogo;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro borda;
	
	public Peca(Tabuleiro borda) {
		this.borda = borda;
		posicao = null;
	}

	protected Tabuleiro getBorda() {
		return borda;
	}

	protected void setBorda(Tabuleiro borda) {
		this.borda = borda;
	}
	
}
