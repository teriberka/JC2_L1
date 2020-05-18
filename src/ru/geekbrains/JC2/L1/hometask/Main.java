package ru.geekbrains.JC2.L1.hometask;

import ru.geekbrains.JC2.L1.hometask.runners.Competition;
import ru.geekbrains.JC2.L1.hometask.runners.Human;
import ru.geekbrains.JC2.L1.hometask.runners.Robot;
import ru.geekbrains.JC2.L1.hometask.runners.Cat;

import ru.geekbrains.JC2.L1.hometask.barriers.Barrier;
import ru.geekbrains.JC2.L1.hometask.barriers.Track;
import ru.geekbrains.JC2.L1.hometask.barriers.Wall;


//1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
//2.Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//участники должны выполнять соответствующие действия (бежать или прыгать),
//результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//
//3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//
//4.* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
//
//5.Задача про дни недели. Прикреплено в материалах


public class Main {
    public static void main(String[] args) {
        Competition[] competitors = {
                new Human("Vasia1"),
                new Human("Vasia2",100, 0),
                new Human("Vasia3",10000, 10),
                new Cat("Kuzya1"),
                new Cat("Kuzia2",1000,5),
                new Cat("Kuzia3",100,5),
                new Robot("r2d2",10000,0),
        };

        Barrier[] obstacles = {
                new Track(5000),
                new Wall(10)
        };

        for (Competition c:competitors ) {
            for (Barrier o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competition c:competitors ) {
            c.info();
        }
    }
}