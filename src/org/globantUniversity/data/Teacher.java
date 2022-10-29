package org.globantUniversity.data;

public class Teacher {

    protected int id;
    protected int identityCard;
    protected String name;

    protected static double baseSalary = 2000;
    protected double totalSalary;
    private static int counter = 0;

    public Teacher(int identityCard, String name) {
        this.id = counter;
        this.identityCard = identityCard;
        this.name = name;
        counter ++;
    }

    @Override
    public String toString() {
        return String.format("|%20d|%20d|%20s|",id,identityCard,name);
    }
}
