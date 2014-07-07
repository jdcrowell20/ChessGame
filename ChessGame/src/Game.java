import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Game {
	JFrame gameWindow;
	JPanel board;
	JPanel sidebar;
	private int framesizeX=800;
	private int framesizeY=600;
	private int boardsize=600;
	private double squaresize= .125*boardsize;
	private double sidebarX = framesizeX-boardsize;
	private double sidebarY = framesizeY-boardsize;
	
	//Gameboard has a matrix of squares (the chessboard)
	private ChessSquare[][] chessboard = new ChessSquare[8][8];
	
	//List of pieces in play
	private ArrayList whitePieces = new ArrayList<ChessPiece>();
	private ArrayList blackPieces = new ArrayList<ChessPiece>();
	//List of captured pieces (for display in sidebar)
	private ArrayList cappedWhitePieces = new ArrayList<ChessPiece>();
	private ArrayList cappedBlackPieces = new ArrayList<ChessPiece>();
	
	private ChessSquare square;
	private ChessPiece piece;
	
	public Game(){	
		//drawBoard();
		initSquares();
		initPieces();
		drawTextBoard();
		System.out.println("Total number of pieces (B, W): " + blackPieces.size() + ", " + whitePieces.size());
		
	}
	
	public void drawBoard(){
		gameWindow = new JFrame("Chess Game");
		//gameWindow.setSize(framesizeX, framesizeY);
		gameWindow.setPreferredSize(new Dimension(framesizeX, framesizeY));
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create panels for board and sidebar (display captured chess pieces)
		board = new JPanel(new BorderLayout());
		board.setBounds(0, 0, boardsize, boardsize);
		board.setName("Chess Board");
		board.setBackground(Color.BLUE);
		
		sidebar = new JPanel(new BorderLayout());
		sidebar.setBounds(boardsize, 0, framesizeX-boardsize, framesizeY);
		sidebar.setName("Sidebar");
		sidebar.setBackground(Color.GREEN);
		
		
		//add elements to the main window
		gameWindow.add(board);
		gameWindow.add(sidebar);
		gameWindow.pack();
		gameWindow.setVisible(true);
	}
	
	public void drawTextBoard(){
		//TODO: Displays simple text implementation of chess board
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				System.out.print(chessboard[i][j].getColor());
			}
			System.out.println();
		}
	}
	
	public void initSquares(){ //Initializes squares of chess board, assigning row/col and color, then adds to ChessBoard matrix
		
		for(int r=0; r < 8; r++){
			for(int c=0; c < 8; c++){
				//Clean up later;  following just determines whether a square is created as black or white
				if((((r%2) != 0) && ((c%2) == 0)) || (((r%2) == 0) && ((c%2) != 0))){
					square = new ChessSquare(r, c, "B");
					chessboard[r][c] = square;
				}
				else{
					square = new ChessSquare(r, c, "W");
					chessboard[r][c] = square;
				}
			}
		}
	}
	
	public void initPieces(){ //Initializes each piece, registering them with existing squares
		//PawnCreation
		initPawns();
		initRooks();
		initKnights();
		initBishops();
		initQueens();
		initKings();
	}
	
	public void initPawns(){
		Pawn bp, wp;
		//create black pawns
		for(int j=0; j<8; j++){
			bp = new Pawn("black");
			chessboard[1][j].setPiece(bp);
			blackPieces.add(bp);
		}
		//create white pawns
		for(int j=0; j<8; j++){
			//p = new Pawn(PieceColor.Black);
			wp = new Pawn("white");
			chessboard[6][j].setPiece(wp);
			whitePieces.add(wp);
			
		}	
	}
	public void initRooks(){
		Rook wr1,wr2, br1,br2;
		//create black rooks
		br1 = new Rook("black");
		chessboard[0][0].setPiece(br1);
		blackPieces.add(br1);
		br2 = new Rook("black");
		chessboard[0][7].setPiece(br2);
		blackPieces.add(br2);
		//create white rooks
		wr1 = new Rook("white");
		chessboard[7][0].setPiece(wr1);
		whitePieces.add(wr1);
		wr2 = new Rook("white");
		chessboard[7][7].setPiece(wr2);
		whitePieces.add(wr2);
	}
	public void initKnights(){
		Knight wn1, wn2, bn1, bn2;
		bn1 = new Knight("black");
		chessboard[0][1].setPiece(bn1);
		blackPieces.add(bn1);
		bn2 = new Knight("black");
		chessboard[0][6].setPiece(bn2);
		blackPieces.add(bn2);
		wn1 = new Knight("white");
		chessboard[7][1].setPiece(wn1);
		whitePieces.add(wn1);
		wn2 = new Knight("white");
		chessboard[7][6].setPiece(wn2);
		whitePieces.add(wn2);
	}
	public void initBishops(){
		Bishop wb1, wb2, bb1, bb2;
		//create black bishops
		bb1 = new Bishop("black");
		chessboard[0][2].setPiece(bb1);
		blackPieces.add(bb1);
		bb2 = new Bishop("black");
		chessboard[0][5].setPiece(bb2);
		blackPieces.add(bb2);
		//create white bishops
		wb1 = new Bishop("white");
		chessboard[7][2].setPiece(wb1);
		whitePieces.add(wb1);
		wb2 = new Bishop("white");
		chessboard[7][5].setPiece(wb2);
		whitePieces.add(wb2);
	}
	public void initQueens(){
		Queen wq, bq;
		//create black queen
		bq = new Queen("black");
		chessboard[0][3].setPiece(bq);
		blackPieces.add(bq);
		//create white queen
		wq = new Queen("white");
		chessboard[7][3].setPiece(wq);
		whitePieces.add(wq);
	}
	public void initKings(){
		King bk, wk;
		//create black king
		bk = new King("black");
		chessboard[0][4].setPiece(bk);
		blackPieces.add(bk);
		//create white king
		wk = new King("white");
		chessboard[7][4].setPiece(wk);
		whitePieces.add(wk);
	}
}
