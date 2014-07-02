

public class Bishop extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public Bishop(PieceType piecetype, PieceColor piececolor){
		this.piecetype = piecetype;
		this.piececolor = piececolor;
	}
	
	//@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		return false;
	}
	

}
