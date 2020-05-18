package ru.geekbrains.JC2.L1.hometask.weekday;

//Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели
//по заданному текущему дню.
//
//Возвращает кол-во оставшихся рабочих часов до конца
//недели по заданному текущему дню. Считается, что
//текущий день ещё не начался, и рабочие часы за него
//должны учитываться.
//Если заданный день выходной то вывести "Сегодня выходной"
//
//public class DayOfWeekMain {
//
//    public static void main(String[] args) {
//        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
//    }


public class Main {
    public static void main(String[] args) {
        Day day = Day.Wednesday;
        if (day.getNumber() >= 6) {
            System.out.println("Сегодня выодной");
        } else {
            System.out.println("Осталось работать: " + (5 - day.getNumber()) * 8 + " часа");
        }
    }
}