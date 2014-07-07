public class Knight extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
		
	public Knight(String piececolor){
		this.piecetype = PieceType.Knight;
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
		txtpc += "Knight";
		return txtpc;
	}

	//@Override
		public boolean isValidMove(Move move, ChessSquare[][] board) {
			/*Valid Knight Actions:
			 * Movement:
			 * 	-Can move (+- 2, +- 1) or (+- 1, +- 2)
			 * 		-destination on board
			 * 		-destination must be empty or occupied by enemy
			 * 		-does not endanger King
			 * 
			 * 
			 */
			return false;
		}
}
