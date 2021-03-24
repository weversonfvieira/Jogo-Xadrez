package xadrez;

import tabuleiro.Tabuleiro;

public class ChessMatch {
	
	private Tabuleiro tab;
	
	public ChessMatch() {
		tab = new Tabuleiro(8 , 8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[tab.getLinhas()][tab.getColunas()];
		for(int i = 0; i < tab.getLinhas(); i++) {
			for(int j = 0; j < tab.getColunas(); j++) {
				mat[i][j] = (ChessPiece) tab.piece(i, j);
			}
		}
		
		return mat;
	}
	

}
