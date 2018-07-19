package com.github.slfotg.chess;

public enum Rank {

    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8);

    static final Rank[] FEN_ORDERED_RANKS = new Rank[] { EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO, ONE };
    static final Rank[] ORDERED_RANKS = new Rank[] { ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT };

    int rankNumber;

    Rank(int rankNumber) {
        this.rankNumber = rankNumber;
    }

    public int getRankNumber() {
        return rankNumber;
    }

    public int getIndex() {
        return rankNumber - 1;
    }

    public String toString() {
        return Integer.toString(rankNumber);
    }
}
