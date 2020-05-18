package ru.geekbrains.JC2.L1.hometask.barriers;

import ru.geekbrains.JC2.L1.hometask.runners.Competition;

public class Track extends Barrier {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competition competitor) {
        competitor.run(distance);
    }
}