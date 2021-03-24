package xadrez.pieces;

import tabuleiro.Tabuleiro;
import xadrez.ChessPiece;
import xadrez.Cor;

public class Torre extends ChessPiece {

	public Torre(Tabuleiro tab, Cor cor) {
		super(tab, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
