package me.twinkle.marsrover.enums;

import me.twinkle.marsrover.util.ComputeRotation;

import java.util.Locale;
import java.util.function.Function;

public enum Direction {
    N(ComputeRotation::rotateFromNorth, 0, 1),
    S(ComputeRotation::rotateFromSouth, 0, -1),
    E(ComputeRotation::rotateFromEast, 1, 0),
    W(ComputeRotation::rotateFromWest, -1, 0);

    public final Function<Movement, Direction> rotate;

    public final int xMovement;

    public final int yMovement;

    Direction(Function<Movement, Direction> movement, int xMovement, int yMovement) {
        this.rotate = movement;
        this.xMovement = xMovement;
        this.yMovement = yMovement;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }
}
