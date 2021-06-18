package me.twinkle.marsrover.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.twinkle.marsrover.enums.Direction;

@Getter
@Setter
@AllArgsConstructor
public class Rover {

    private int roverXAxis;

    private int roverYAxis;

    private Direction direction;
}
