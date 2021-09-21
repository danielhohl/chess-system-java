package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Protegido pois deve ser acessado somente pelo tabuleiro "Board" e não por outras classes externas. Deixando limitante para que o sitema fique mais protegido e evite acessos externos evitando erros.
	protected Board getBoard() {
		return board;
	}	
}
