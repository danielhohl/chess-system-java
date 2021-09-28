package boardgame;

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	
	//Verificar/TESTAR se a peça pode ser colocada nessa posição. Retorna uma matriz - Método concreto. - Retorna verdadeiro - ou TRUE onde a peça pode ser colocada.
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//Função conta se tem pelo menos UM movimento possível para a peça no tabuleiro.
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}	
	
}
