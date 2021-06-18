package me.twinkle.marsrover.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.twinkle.marsrover.enums.Direction;
import me.twinkle.marsrover.enums.Movement;

@Getter
@Setter
@AllArgsConstructor
public class Rover {

    private int roverXAxis;

    private int roverYAxis;

    private Direction direction;

    public void rotate(Movement moveTo) {
        this.direction = this.direction.rotate.apply(moveTo);
    }

    public void move() {
        this.roverXAxis += direction.xMovement;
        this.roverYAxis += direction.yMovement;
    }
}
