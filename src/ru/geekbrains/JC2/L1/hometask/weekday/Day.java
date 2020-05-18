package ru.geekbrains.JC2.L1.hometask.weekday;


public enum Day {
    Monday(1), Tuesday(2), Wednesday(3), Thursday(4),
    Friday(5), Saturday(6), Sunday(7);

    private int number;

    Day(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}