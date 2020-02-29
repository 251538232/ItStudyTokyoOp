package com.it.study.tokyo.tian.y2019.d12.veg;

import java.util.Objects;

/**
 * @author tian
 */
public class Vegetables {
    /**
     * vegetable name
     */
    private String name;

    public Vegetables(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Vegetables a = new Vegetables("1");
        Vegetables b = new Vegetables("1");

        System.out.println(a.equals(b));
        System.out.println(a == b);
    }

    @Override
    public boolean equals(Object o) {
        return getName().equals(((Vegetables) o).getName());
    }
}
