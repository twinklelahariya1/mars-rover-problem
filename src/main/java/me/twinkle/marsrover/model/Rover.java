package me.twinkle.marsrover.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.twinkle.marsrover.enums.Direction;

@Getter
@Setter
@AllArgsConstructor
public class Rover {

    private final int roverXAxis;

    private final int roverYAxis;

    private final Direction direction;
}
