package org.divya.LLDTicTacToe.Model;

import java.util.ArrayList;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freecells = new ArrayList<>();

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == null) {
                    Pair<Integer, Integer> rowCol = new Pair<>(i, j);
                    freecells.add(rowCol);
                }
            }
        }
        return freecells;
    }

}
