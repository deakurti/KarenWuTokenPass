package com.company;

public class TokenPass {
    private int[] board;
    private int currentplayer;
    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for (int i = 0; i < board.length; i++)
            board[i] = (int) (Math.random() * 10 + 1);

        currentPlayer = (int) (Math.random() * playerCount);
    }
}
