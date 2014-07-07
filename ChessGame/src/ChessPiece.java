
public abstract class ChessPiece {

	public enum PieceColor{ Black, White; }
	public enum PieceType{ Pawn, Rook, Bishop, Knight, Queen, King;}
	private ChessSquare position;
	
	
	public abstract boolean isValidMove(Move move, ChessSquare[][] board);
	public abstract String getPieceTextRepr(); //returns txt representation of piece for text-board
	
	public ChessSquare getPosition(){
		return this.position;
	}
	public void setPosition(ChessSquare p){
		this.position = p;
	}
	
	
	
}


