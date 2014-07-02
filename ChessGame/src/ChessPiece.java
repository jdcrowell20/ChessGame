
public abstract class ChessPiece {

	public abstract boolean isValidMove(Move move, ChessSquare[][] board);
	
	public enum PieceColor{ Black, White; }
	public enum PieceType{ Pawn, Rook, Bishop, Knight, Queen, King;}
	
}
