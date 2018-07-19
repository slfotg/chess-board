package com.github.slfotg.chess;

public class Position {

    private Rank rank;
    private File file;

    public Position(Rank rank, File file) {
        this.rank = rank;
        this.file = file;
    }

    public Rank getRank() {
        return rank;
    }

    public File getFile() {
        return file;
    }

    public int getIndex() {
        return file.getIndex() + rank.getIndex() * 8;
    }

    public String toString() {
        return String.format("%s%s", file.toString(), rank.toString());
    }
}
