package boardgame;

public abstract  class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}


	public Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean posibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
		
		
	


	
	
	
	
	
	

}
