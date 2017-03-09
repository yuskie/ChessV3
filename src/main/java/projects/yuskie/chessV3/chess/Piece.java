package projects.yuskie.chessV3.chess;

import projects.yuskie.chessV3.chess.Utility.Color;

public interface Piece {

	public String print();

	public Color getColor();

	public boolean validMove(String startLocation, String endLocation);

	public void moved();

	public boolean isMoved();
	
}