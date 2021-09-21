package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	//� nessa classe que dizemos que o tabuleiro � 8 X 8.
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	//Retorna a posi��o das pe�as no tabuleiro.
	public ChessPiece[][] getpieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j = 0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
}
