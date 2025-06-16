package com.example.first_project;

import java.util.Objects;

public class Bread {
    private String name;
    private int numIngredients;

    public Bread(String name, int numIngredients) {
        this.name = name;
        this.numIngredients = numIngredients;
    }

    public String getName() {
        return name;
    }

    public int getNumIngredients() {
        return numIngredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumIngredients(int numIngredients) {
        this.numIngredients = numIngredients;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Bread other = (Bread) o;
        return Objects.equals(this.name, other.name);
    }
}
