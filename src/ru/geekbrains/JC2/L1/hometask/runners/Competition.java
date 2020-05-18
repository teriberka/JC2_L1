package ru.geekbrains.JC2.L1.hometask.runners;

public interface Competition {
    boolean isOnDistance();

    void info();
    void run(int dist);
    void jump(int height);
}
