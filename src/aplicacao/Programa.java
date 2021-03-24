package aplicacao;

import xadrez.ChessMatch;

public class Programa {
	
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.imprimirTabuleiro(chessMatch.getPieces());
	}

}
