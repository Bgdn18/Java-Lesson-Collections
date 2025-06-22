package OOP.record;

import java.util.Objects;

public class Human {
    private final int birthYear;
    private final String firstName;
    private final String surName;
    private final String lastName;

    public void getInfo() {
        System.out.println(this.firstName + " " +  this.lastName);
    }

    public Human(int birthYear, String firstName, String surName, String lastName) {
        this.birthYear = birthYear;
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        System.out.println("Hello from Human");
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthYear == human.birthYear && Objects.equals(firstName, human.firstName) && Objects.equals(surName, human.surName) && Objects.equals(lastName, human.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthYear, firstName, surName, lastName);
    }

    @Override
    public String toString() {
        return "Human{" +
                "birthYear=" + birthYear +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}