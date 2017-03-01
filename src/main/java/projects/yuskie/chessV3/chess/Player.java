package projects.yuskie.chessV3.chess;

import projects.yuskie.chessV3.chess.Utility.Color;

public class Player {
	private Color color;
	
	public Player(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return this.color;
	}
	
}