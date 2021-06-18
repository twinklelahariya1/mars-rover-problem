package me.twinkle.marsrover.enums;

import java.util.Locale;

public enum Movement {

    L,
    R;

    @Override
    public String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }
}
