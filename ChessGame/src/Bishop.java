public class Bishop extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;

	
	public Bishop(String piececolor){
		this.piecetype = PieceType.Bishop;
		if(piececolor.equals("black")){ this.piececolor = PieceColor.Black;}
		else if(piececolor.equals("white")){this.piececolor = PieceColor.White;}
	}
	

	@Override
	public String getPieceTextRepr() {
		String txtpc = "";
		if(this.piececolor.equals(PieceColor.Black)){
			txtpc += "B-";
		}
		else{
			txtpc += "W-";
		}
		txtpc += "Bishop";
		return txtpc;
	}

	@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		/*Valid Bishop Actions:
		 * Movement:
		 * 	-Can move diagonally any length on board
		 * 		-if unobstructed by friendly/enemy piece
		 * 		-if doing so does not endanger king
		 * Attack:
		 * 	-Diagonally to first square along vector occupied by enemy piece
		 * 		-if preceding spaces are empty
		 * 		-if doing so does not endanger king
		 */
		
		
		return false;
	}
	
	

}
