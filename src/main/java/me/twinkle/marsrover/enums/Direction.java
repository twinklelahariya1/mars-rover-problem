package me.twinkle.marsrover.enums;

import java.util.Locale;

public enum Direction {
    N,
    S,
    E,
    W;

    @Override
    public String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }
}
