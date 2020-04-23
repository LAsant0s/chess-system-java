package boardgame;

public class Piece {
	
	protected Position position; // posicao de matriz 
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // null = pe�a n colocada no tabuleiro ainda
	}

	protected Board getBoard() {
		return board;
	}
} 
