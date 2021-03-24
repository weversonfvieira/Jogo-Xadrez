package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pieces.Rei;
import xadrez.pieces.Torre;

public class ChessMatch {
	
	private Tabuleiro tab;
	
	public ChessMatch() {
		tab = new Tabuleiro(8 , 8);
		initialSetup();
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
	
	private void initialSetup() {
		tab.placePiece(new Torre(tab, Cor.WHITE), new Posicao(2 , 1));
		tab.placePiece(new Rei(tab, Cor.BLACK), new Posicao(0, 4));
		tab.placePiece(new Rei(tab, Cor.BLACK), new Posicao(7, 4));
	}

}
