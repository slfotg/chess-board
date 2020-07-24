package com.github.slfotg.chess.state;

import java.util.Optional;
import java.util.StringJoiner;

import com.github.slfotg.chess.ChessBoard;
import com.github.slfotg.chess.Color;
import com.github.slfotg.chess.ColoredPiece;
import com.github.slfotg.chess.File;
import com.github.slfotg.chess.Position;
import com.github.slfotg.chess.Rank;

public class ForsythEdwardsNotationParser {

//    public GameState parseFen(String fenCode) {
//        String[] fenSplit = fenCode.split(" ");
//        ChessBoard board = new ChessBoard();
//        String[] ranks = fenSplit[0].split("/");
//        for (int i = 0; i < ranks.length; i += 1) {
//            Rank currentRank = Rank.FEN_ORDERED_RANKS[i];
//            int currentFileIndex = 0;
//            for (int j = 0; j < ranks[i].length(); j += 1) {
//                char code = ranks[i].charAt(j);
//                if (Character.isDigit(code)) {
//                    currentFileIndex += Integer.parseInt(Character.toString(code));
//                } else {
//                    ColoredPiece piece = ColoredPiece.fromFenCode(code);
//                    board.setPieceAt(piece, new Position(currentRank, File.FEN_ORDERED_FILES[currentFileIndex]));
//                    currentFileIndex += 1;
//                }
//            }
//        }
//        board.activeColor = Color.fromCode(fenSplit[1].charAt(0));
//        board.whiteCastlingRights = CastlingRights.parseWhiteRights(fenSplit[2]);
//        board.blackCastlingRights = CastlingRights.parseBlackRights(fenSplit[2]);
//        board.enPassant = Position.fromCode(fenSplit[3]);
//        board.halfMoveClock = Integer.parseInt(fenSplit[4]);
//        board.fullMoveNumber = Integer.parseInt(fenSplit[5]);
//        return board;
//    }
//    
//    public String toFenCode() {
//        StringJoiner fenJoiner = new StringJoiner(" ");
//        StringJoiner pieceJoiner = new StringJoiner("/");
//        for (int i = 0; i < Rank.FEN_ORDERED_RANKS.length; i += 1) {
//            int skips = 0;
//            StringBuilder rankBuilder = new StringBuilder();
//            for (int j = 0; j < File.FEN_ORDERED_FILES.length; j += 1) {
//                Optional<ColoredPiece> piece = getPieceAt(
//                        new Position(Rank.FEN_ORDERED_RANKS[i], File.FEN_ORDERED_FILES[j]));
//                if (piece.isPresent()) {
//                    if (skips > 0) {
//                        rankBuilder.append(Integer.toString(skips));
//                    }
//                    skips = 0;
//                    rankBuilder.append(piece.get().getFenCode());
//                } else {
//                    skips += 1;
//                }
//            }
//            if (skips > 0) {
//                rankBuilder.append(Integer.toString(skips));
//            }
//            pieceJoiner.add(rankBuilder.toString());
//        }
//        fenJoiner.add(pieceJoiner.toString());
//        fenJoiner.add(activeColor.toString());
//        fenJoiner.add(CastlingRights.toString(whiteCastlingRights, blackCastlingRights));
//        fenJoiner.add(enPassant.isPresent() ? enPassant.get().toString() : "-");
//        fenJoiner.add(Integer.toString(halfMoveClock));
//        fenJoiner.add(Integer.toString(fullMoveNumber));
//        return fenJoiner.toString();
//    }
}
