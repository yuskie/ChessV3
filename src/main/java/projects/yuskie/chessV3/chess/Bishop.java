package projects.yuskie.chessV3.chess;

import static projects.yuskie.chessV3.chess.Utility.BOARD_SIZE;
import static projects.yuskie.chessV3.chess.Utility.diagonalMovement;

import projects.yuskie.chessV3.chess.Utility.Color;

public class Bishop implements Piece {
	private Color color;
	private boolean moved;

	public Bishop(Color color) {
		this.color = color;
		this.moved = false;
	}
	
	public boolean validMove(String startLocation, String endLocation) {
		return diagonalMovement(startLocation, endLocation, BOARD_SIZE);
	}

	public String print() {
		String color = "";
		if (this.color == Color.BLACK) {
			color = "b";
		} else if (this.color == Color.WHITE) {
			color = "w";
		}
		return color + "-B";
	}

	public Color getColor() {
		return this.color;
	}

	public void moved() {
		this.moved = true;
	}
	
	public boolean isMoved(){
		return this.moved;
	}
}
