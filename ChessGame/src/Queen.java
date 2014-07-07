public class Queen extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	
	public Queen(String piececolor){
		this.piecetype = PieceType.Queen;
		if(piececolor.equals("black")){ this.piececolor = PieceColor.Black;}
		else if(piececolor.equals("white")){this.piececolor = PieceColor.White;}
	}

	
	@Override
	public String getPieceTextRepr() {
		String txtpc = "";
		txtpc += this.piececolor;
		txtpc += this.piecetype;
		
		return txtpc;
	}
	
	@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		/*Valid Queen Actions:
		 * Movement:
		 * 	- Can move any length in any direction where there are no obstructions and on game board
		 * 		-Doesn't endanger king
		 * Attack:
		 * 	- All spaces between are empty
		 * 		- Doesn't endanger king
		 */
		
		return false;
	}
}
