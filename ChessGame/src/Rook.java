

public class Rook extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public Rook(PieceType piecetype, PieceColor piececolor){
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
