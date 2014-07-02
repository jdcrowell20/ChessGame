
public class ChessSquare {
	private int xLoc;
	private int yLoc;
	private String squareColor;
	
	public int getX(){
		return xLoc;
	}
	public int getY(){
		return yLoc;
	}
	public void setX(int xloc){
		this.xLoc = xloc;
	}
	public void setY(int yloc){
		this.yLoc = yloc;
	}
	public String getColor(){
		return squareColor;
	}
	public void setColor(String squarecolor){
		this.squareColor = squarecolor;
	}
	
}
