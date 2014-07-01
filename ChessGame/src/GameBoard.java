
public class GameBoard {
	private static int bLen = 8;
	private static int bWid = 8;
	
	public GameBoard(){
		
	}
	
	public static void displayBoard(){
		for(int i = 0; i < bLen; i++){
			for(int j = 0; j < bWid; j++){
				System.out.print("[ ]");
			}
			System.out.println();
		}
		
	}
	
}
