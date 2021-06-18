package me.twinkle.marsrover.util;

import me.twinkle.marsrover.enums.Direction;
import me.twinkle.marsrover.enums.Movement;
import me.twinkle.marsrover.model.Rover;

public class ComputeRotation {

    public static Rover rotate(Movement moveTo, Rover rover) {
        rover.getDirection().rotate.apply(moveTo, rover);
        return rover;
    }

    public static Rover rotateFromNorth(Movement moveTo, Rover rover) {
        if (moveTo.equals(Movement.R))
            rover.setDirection(Direction.E);
        else
            rover.setDirection(Direction.W);

        return rover;
    }

    public static Rover rotateFromSouth(Movement moveTo, Rover rover) {
        if (moveTo.equals(Movement.R))
            rover.setDirection(Direction.E);
        else
            rover.setDirection(Direction.W);

        return rover;
    }

    public static Rover rotateFromEast(Movement moveTo, Rover rover) {
        if (moveTo.equals(Movement.R))
            rover.setDirection(Direction.N);
        else
            rover.setDirection(Direction.S);

        return rover;
    }

    public static Rover rotateFromWest(Movement moveTo, Rover rover) {
        if (moveTo.equals(Movement.R))
            rover.setDirection(Direction.S);
        else
            rover.setDirection(Direction.N);

        return rover;
    }
}
