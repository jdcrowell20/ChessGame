public class King extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	private boolean firstmove;	//For castling
	private boolean isChecked;
	
	public King(String piececolor){
		this.piecetype = PieceType.King;
		if(piececolor.equals("black")){ this.piececolor = PieceColor.Black;}
		else if(piececolor.equals("white")){this.piececolor = PieceColor.White;}
		this.firstmove = true;
		this.isChecked = false;
	}

	public boolean canCastle(){
		/*
		 * Define this later
		 */
		return false;
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
		txtpc += "King  ";
		return txtpc;
	}
	
	@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		/*Valid King Actions:
		 * Movement:
		 * 	- Can move one space in any direction
		 * 		-if space is empty
		 * 		-if doing so doesn't put King in danger
		 * 
		 * Attack:
		 * 	-Can attack in one space any direction
		 * 		-If doing so does not endanger King
		 */
		
		return false;
	}
}
