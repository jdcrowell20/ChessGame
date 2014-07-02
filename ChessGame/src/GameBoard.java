import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class GameBoard {
	JFrame gameWindow;
	JPanel board;
	JPanel sidebar;
	private int framesizeX=800;
	private int framesizeY=800;
	private int boardsize=500;
	private double squaresize= .125*boardsize;
	private double sidebarX = framesizeX-boardsize;
	private double sidebarY = framesizeY-boardsize;
	
	public GameBoard(){	
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
		
		drawBoard();
		gameWindow.pack();
		gameWindow.setVisible(true);
	}
	
	public void drawBoard(){
		
	}
}
