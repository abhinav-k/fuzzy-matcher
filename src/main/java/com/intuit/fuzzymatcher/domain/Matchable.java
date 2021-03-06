package com.intuit.fuzzymatcher.domain;

import java.util.function.Function;

/**
 *
 * Interface implemented by Document, Element and Token to enable matching and scoring these objects
 */
public interface Matchable {

    public long getChildCount();

    public long getEmptyChildCount();

    public Function<Match, Score> getScoringFunction();

    public double getWeight();
}
