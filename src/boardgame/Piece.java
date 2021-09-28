package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Protegido pois deve ser acessado somente pelo tabuleiro "Board" e n�o por outras classes externas. Deixando limitante para que o sitema fique mais protegido e evite acessos externos evitando erros.
	protected Board getBoard() {
		return board;
	}	
	
	public abstract boolean[][] possibleMoves();
	
	//Verificar/TESTAR se a pe�a pode ser colocada nessa posi��o. Retorna uma matriz - M�todo concreto. - Retorna verdadeiro - ou TRUE onde a pe�a pode ser colocada.
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//Fun��o conta se tem pelo menos UM movimento poss�vel para a pe�a no tabuleiro.
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
