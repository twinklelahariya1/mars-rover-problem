package me.twinkle.marsrover.util;

import me.twinkle.marsrover.enums.Direction;
import me.twinkle.marsrover.enums.Movement;

public class ComputeRotation {

    public static Direction rotateFromNorth(Movement moveTo) {
        if (moveTo.equals(Movement.R))
            return Direction.E;
        else
            return Direction.W;
    }

    public static Direction rotateFromSouth(Movement moveTo) {
        if (moveTo.equals(Movement.R))
            return Direction.E;
        else
            return Direction.W;
    }

    public static Direction rotateFromEast(Movement moveTo) {
        if (moveTo.equals(Movement.R))
            return Direction.N;
        else
            return Direction.S;
    }

    public static Direction rotateFromWest(Movement moveTo) {
        if (moveTo.equals(Movement.R))
            return Direction.S;
        else
            return Direction.N;
    }
}
