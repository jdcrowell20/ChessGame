

public class Pawn extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public Pawn(PieceType piecetype, PieceColor piececolor){
		this.piecetype = piecetype;
		this.piececolor = piececolor;
	}
	
	//@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		return false;
	}
	
	public boolean canEnPassant(){
		return false;
	}
}
