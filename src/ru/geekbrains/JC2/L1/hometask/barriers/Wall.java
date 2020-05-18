package ru.geekbrains.JC2.L1.hometask.barriers;

import ru.geekbrains.JC2.L1.hometask.runners.Competition;

public class Wall extends Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competition competitor) {
        competitor.jump(height);
    }
}