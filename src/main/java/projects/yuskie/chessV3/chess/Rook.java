package projects.yuskie.chessV3.chess;

import projects.yuskie.chessV3.chess.Utility.Color;
import static projects.yuskie.chessV3.chess.Utility.*;

public class Rook implements Piece {
	private Color color;
	private boolean moved;
	
	public Rook(Color color) {
		this.color = color;
		this.moved = false;
	}

	public boolean validMove(String startLocation, String endLocation) {
		return straightMovement(startLocation, endLocation, BOARD_SIZE);
	}

	public String print() {
		String color = "";
		if (this.color == Color.BLACK) {
			color = "b";
		} else if (this.color == Color.WHITE) {
			color = "w";
		}
		return color + "-R";
	}

	public Color getColor() {
		return this.color;
	}

	public void moved() {
		this.moved = true;
	}

	public boolean isMoved() {
		return this.moved;
	}
}
