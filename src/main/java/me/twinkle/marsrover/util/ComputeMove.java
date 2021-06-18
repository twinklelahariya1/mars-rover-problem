package me.twinkle.marsrover.util;

import me.twinkle.marsrover.model.Rover;

public class ComputeMove {

    public static Rover move(Rover rover) {
        rover.getDirection().move.apply(rover);
        return rover;
    }

    public static Rover moveNorth(Rover rover) {
        rover.setRoverYAxis(rover.getRoverYAxis() + 1);
        return rover;
    }

    public static Rover moveSouth(Rover rover) {
        rover.setRoverYAxis(rover.getRoverYAxis() - 1);
        return rover;
    }

    public static Rover moveWest(Rover rover) {
        rover.setRoverXAxis(rover.getRoverXAxis() + 1);
        return rover;
    }

    public static Rover moveEast(Rover rover) {
        rover.setRoverXAxis(rover.getRoverXAxis() - 1);
        return rover;
    }
}
