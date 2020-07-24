package com.github.slfotg.game;

public interface GameState {

    Iterable<GameState> nextPossibleStates();
}
