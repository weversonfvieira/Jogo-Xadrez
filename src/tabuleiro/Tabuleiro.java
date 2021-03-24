package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Piece[][] pieces;
	
	public Tabuleiro(int linha, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pieces = new Piece[linha][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

}
