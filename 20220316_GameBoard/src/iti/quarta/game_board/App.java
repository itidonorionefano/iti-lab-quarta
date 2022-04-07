package iti.quarta.game_board;

import iti.quarta.game_board.enums.Color;
import iti.quarta.game_board.utils.Pair;

public final class App {

	public static void main(String[] args) {
		final GameBoard gameBoard = new GameBoard();
        gameBoard.getBlock(new Pair<>(0, 0)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(0, 2)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(0, 4)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(0, 6)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(1, 1)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(1, 3)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(1, 5)).setPiece(new Pawn(Color.BLACK));
        gameBoard.getBlock(new Pair<>(1, 7)).setPiece(new Pawn(Color.BLACK));
        System.out.println(gameBoard.printBoard());
	}

}
