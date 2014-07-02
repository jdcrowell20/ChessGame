

public class Knight extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public Knight(PieceType piecetype, PieceColor piececolor){
		this.piecetype = piecetype;
		this.piececolor = piececolor;
	}
	
	//@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		return false;
	}
	

}
