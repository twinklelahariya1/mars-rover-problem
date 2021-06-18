package me.twinkle.marsrover.enums;

import me.twinkle.marsrover.model.Rover;
import me.twinkle.marsrover.util.ComputeRotation;
import me.twinkle.marsrover.util.ComputeMove;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public enum Direction {
    N(ComputeRotation::rotateFromNorth, ComputeMove::moveNorth),
    S(ComputeRotation::rotateFromSouth, ComputeMove::moveSouth),
    E(ComputeRotation::rotateFromEast, ComputeMove::moveEast),
    W(ComputeRotation::rotateFromWest, ComputeMove::moveWest);

    public final BiFunction<Movement, Rover, Rover> rotate;

    public final Function<Rover, Rover> move;

    Direction(BiFunction<Movement, Rover, Rover> movement, Function<Rover, Rover> move) {
        this.rotate = movement;
        this.move = move;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }
}
