package com.github.slfotg.game;

public interface EvaluationFunction<S extends GameState, V extends Comparable<V>> {

    V evaluate(S state);
}
