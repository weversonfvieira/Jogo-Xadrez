package xadrez;

import tabuleiro.Piece;
import tabuleiro.Tabuleiro;

public class ChessPiece extends Piece {
	
	private Cor cor;
	
	public ChessPiece(Tabuleiro tab, Cor cor) {
		super(tab);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
