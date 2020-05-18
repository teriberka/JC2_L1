package ru.geekbrains.JC2.L1.hometask.runners;

public class Cat implements Competition{

    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;

    private boolean onDistance;


    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name) {this(name, 1000, 1);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + dist + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + dist + " метров");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул " + height + " метров");
        } else {
            System.out.println(name + " не может " + height + " метров прыгнуть");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " +
                (onDistance ? " на дистанции" : " выбыл из соревнований"));
    }
}

