package com.github.slfotg.chess;

import java.util.Optional;

import lombok.NonNull;

public class Position {

    private final Rank rank;
    private final File file;

    public Position(@NonNull Rank rank, @NonNull File file) {
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

    public static Optional<Position> fromCode(@NonNull String code) {
        if (code.equals("-")) {
            return Optional.empty();
        } else if (!code.matches("[a-h]{1}[1-8]{1}")) {
            throw new IllegalArgumentException(String.format("Code {%s} cannot be parsed to a Position", code));
        }
        File file = File.fromCode(code.charAt(0));
        Rank rank = Rank.fromCode(code.charAt(1));
        return Optional.of(new Position(rank, file));
    }

    public String toString() {
        return String.format("%s%s", file.toString(), rank.toString());
    }
}
