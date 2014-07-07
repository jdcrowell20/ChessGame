public class Rook extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	private boolean firstmove;	//For castling
	
	public Rook(String piececolor){
		this.piecetype = PieceType.Rook;
		if(piececolor.equals("black")){ this.piececolor = PieceColor.Black;}
		else if(piececolor.equals("white")){this.piececolor = PieceColor.White;}
		this.firstmove = true;
	}

	public boolean canCastle(){
		/*
		 * Define this later
		 */
		return false;
	}

	public String getPieceTextRepr() {
		String txtpc = "";
		txtpc += this.piececolor;
		txtpc += this.piecetype;
		
		return txtpc;	
	}
	
	
	@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		/*Valid Rook actions:
		 * Movement:
		 * 	-can move sideways or forward as many spaces as on board
		 * 		-can't go through friendly or enemy pieces
		 * 	-doesn't endanger king by moving
		 * Castling:
		 *  -(http://en.wikipedia.org/wiki/Castling)
		 * 
		 * Attack:
		 * -Any non-diagonal to first square along vector occupied by enemy piece
		 * 		-if preceding spaces are empty
		 * 		-if doing so does not endanger king
		 */
		return false;
	}
}
