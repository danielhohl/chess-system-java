package chess;


import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	//é nessa classe que dizemos que o tabuleiro é 8 X 8.
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	//Retorna a posição das peças no tabuleiro.
	public ChessPiece[][] getpieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j = 0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//Coloca peças no tabuleiro
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board,Color.WHITE));
		placeNewPiece('e', 8, new King(board,Color.BLACK));
		placeNewPiece('e', 1 ,new King(board,Color.WHITE));
	}
}
