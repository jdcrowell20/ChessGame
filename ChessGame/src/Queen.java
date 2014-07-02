

public class Queen extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public Queen(PieceType piecetype, PieceColor piececolor){
		this.piecetype = piecetype;
		this.piececolor = piececolor;
	}
	
	//@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		return false;
	}
	

}
