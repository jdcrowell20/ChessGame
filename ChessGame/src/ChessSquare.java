
public class ChessSquare {
	private int sqRow;
	private int sqCol;
	private String squareColor;
	private boolean isEmpty;
	private ChessPiece squareOccupant;
	
	
	public ChessSquare(int row, int col, String color){
		this.sqRow = row;
		this.sqCol = col;
		this.squareColor = color;
		this.isEmpty = true;
	}
	
	public int getRow(){
		return sqRow;
	}
	public int getCol(){
		return sqCol;
	}
	public String getColor(){
		return squareColor;
	}
	public void setColor(String squarecolor){
		this.squareColor = squarecolor;
	}
	
	public void setPiece(ChessPiece pc){
		this.squareOccupant = pc;
		this.squareOccupant.setPosition(this); //update ChessPiece to know it is in this square
		this.isEmpty = false;
	}
	public ChessPiece getPiece(){
		return this.squareOccupant;
	}
	
	public void markEmpty(){
		//Use this when a piece leaves its square
		this.isEmpty = true;
	}
}
