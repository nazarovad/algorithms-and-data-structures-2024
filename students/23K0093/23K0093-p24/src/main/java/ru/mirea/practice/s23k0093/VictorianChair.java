package ru.mirea.practice.s23k0093;

abstract class VictorianChair implements Chair {
    private int age;

    public void victorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}