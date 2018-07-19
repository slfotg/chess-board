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

    public static Rank fromCode(char code) {
        switch (code) {
        case '1':
            return ONE;
        case '2':
            return TWO;
        case '3':
            return THREE;
        case '4':
            return FOUR;
        case '5':
            return FIVE;
        case '6':
            return SIX;
        case '7':
            return SEVEN;
        case '8':
            return EIGHT;
        default:
            throw new IllegalArgumentException(String.format("Code %s cannot be converted to a Rank", code));
        }
    }

    @Override
    public String toString() {
        return Integer.toString(rankNumber);
    }
}
