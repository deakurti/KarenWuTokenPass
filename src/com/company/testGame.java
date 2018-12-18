package com.company;

public class testGame {
    public void DistributeCurrentPlayerTokens()

    {
        int tokens = board[currentPlayer];
        int targetIndex = currentPlayer + 1;

        while (tokens > 0) {
            if (targetIndex == board.length)
                targetIndex = 0;

            board[targetIndex]++;
            tokens--;
            targetIndex++;
        }
    }
}