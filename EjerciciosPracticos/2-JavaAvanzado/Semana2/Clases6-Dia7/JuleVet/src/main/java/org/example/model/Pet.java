package org.example.model;

public class Pet<T> {
    private T code;
    private String name;
    private int age;
    private String species;

    public Pet(T code, String name, int age, String species) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
