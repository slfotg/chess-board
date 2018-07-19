package com.github.slfotg.chess;

public class ForsythEdwardsNotationParser {

    public ChessBoard parseFen(String fenCode) {
        String[] fenSplit = fenCode.split(" ");
        ChessBoard board = new ChessBoard();
        String[] ranks = fenSplit[0].split("/");
        for (int i = 0; i < ranks.length; i += 1) {
            Rank currentRank = Rank.FEN_ORDERED_RANKS[i];
            int currentFileIndex = 0;
            for (int j = 0; j < ranks[i].length(); j += 1) {
                char code = ranks[i].charAt(j);
                if (Character.isDigit(code)) {
                    currentFileIndex += Integer.parseInt(Character.toString(code));
                } else {
                    ColoredPiece piece = ColoredPiece.fromFenCode(code);
                    board.setPieceAt(piece, new Position(currentRank, File.FEN_ORDERED_FILES[currentFileIndex]));
                    currentFileIndex += 1;
                }
            }
        }
        board.activeColor = Color.fromCode(fenSplit[1].charAt(0));
        board.whiteCastlingRights = CastlingRights.parseWhiteRights(fenSplit[2]);
        board.blackCastlingRights = CastlingRights.parseBlackRights(fenSplit[2]);
        board.enPassant = Position.fromCode(fenSplit[3]);
        board.halfMoveClock = Integer.parseInt(fenSplit[4]);
        board.fullMoveNumber = Integer.parseInt(fenSplit[5]);
        return board;
    }
}
