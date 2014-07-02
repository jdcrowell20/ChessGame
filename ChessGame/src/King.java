
public class King extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public King(PieceType piecetype, PieceColor piececolor){
		this.piecetype = piecetype;
		this.piececolor = piececolor;
	}
	
	//@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		return false;
	}
	
	public boolean canCastle(){
		return false;
	}
	

}
