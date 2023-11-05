package racinggame.domain;

import java.util.List;

public class RacingGame {

    private final Cars cars;

    public RacingGame(Cars cars) {
        this.cars = cars;
    }

    public int carsCount() {
        return this.cars.size();
    }

    public void play() {
        cars.move();
    }

    public Cars cars() {
        return cars;
    }

    public List<Distance> report() {
        return cars.movingDistances();
    }

    public Cars winners() {
        return cars.mostMoved();
    }
}
