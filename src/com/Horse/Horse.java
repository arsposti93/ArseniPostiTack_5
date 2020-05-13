package com.Horse;

import com.company.Movable;

import java.util.Objects;

public class Horse implements Movable {

    private String name;
    private int age;

    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Лошадь породы: ").append(name).append(", ").append("возраст: ").append(age)
                .append(" ").append(voice());
        return stringBuilder.toString();
    }

    @Override
    public void move() {
        System.out.println("When say common");
    }

    @Override
    public void stop() {
        System.out.println("When say stop");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return getAge() == horse.getAge() &&
                getName().equals(horse.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public String voice() {
        return "IiiiiG0-go-go";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
