

public class Pawn extends ChessPiece {
	PieceType piecetype;
	PieceColor piececolor;
	private boolean firstmove;	//When true, enables piece to move forward two positions, not one.
	
	public Pawn(String piececolor){
		this.piecetype = PieceType.Pawn;
		if(piececolor.equals("black")){ this.piececolor = PieceColor.Black;}
		else if(piececolor.equals("white")){this.piececolor = PieceColor.White;}
		
		this.firstmove = true;
	}
	
	public boolean canEnPassant(){
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
		txtpc += "Pawn  ";
		return txtpc;
	}
	
	public void dispValue(){
		System.out.print("piece type/color for Pawn is: ");
		System.out.println(this.piecetype + " ");
		System.out.println(this.piececolor);
	}
	
	
	@Override
	public boolean isValidMove(Move move, ChessSquare[][] board) {
		/*Valid Pawn actions:
		 * Movement:
		 * - If first turn, can move forward 1 or 2 spaces
		 * - Otherwise, can move forward 1 space if:
		 * 		- space ahead not occupied
		 * 		- space ahead not out of bounds
		 * Promotion:
		 * - If moves into end of board, prompt player for upgrade choice
		 * Attack:
		 * -Can move forward + left/right if:
		 * 		-(fwd + l/r) is occupied by enemy piece
		 * 		-moving this way does not endanger king
		 * 	-En passant:  (http://en.wikipedia.org/wiki/En_passant)
		 */
		
		
		 //srcRow = move.srcRow;
		 //srcCol = move.srcCol;
		 //if(board[srcRow][srcCol].getPiece().
		 //if ChessSquare
		 //Logic for white (reverse for black):
		 
			
		
		return false;
	}

	
	
}
