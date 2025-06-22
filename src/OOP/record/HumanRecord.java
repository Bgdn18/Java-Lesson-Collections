package OOP.record;

public record HumanRecord(
        int birthYear,
        String firstName,
        String surName,
        String lastName) {

    public HumanRecord {
        System.out.println("Hello from RecordUser");
    }

    public void getInfo() {
        System.out.println(this.firstName + " " +  this.lastName);
    }
}