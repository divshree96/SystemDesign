package org.divya.LLDTicTacToe;

import org.example.LLDTicTacToe.Model.Board;
import org.example.LLDTicTacToe.Model.Player;
import org.example.LLDTicTacToe.Model.PlayingPieceO;
import org.example.LLDTicTacToe.Model.PlayingPieceX;

import java.util.Deque;
import java.util.LinkedList;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }
}
