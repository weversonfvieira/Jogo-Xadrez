package aplicacao;

import xadrez.ChessPiece;

public class UI {
	
	public static void imprimirTabuleiro(ChessPiece[][] pieces) {
		for(int i = 0; i < pieces.length; i++) {
			System.out.println((8 - i) + " ");
			for(int j = 0; j<pieces.length; j++) {
				imprimirPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println(" a b c d e f g h");
	}
	
	private static void imprimirPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.println("-");
		}else {
			System.out.println(piece);
		}
		System.out.println(" ");
	}

}
