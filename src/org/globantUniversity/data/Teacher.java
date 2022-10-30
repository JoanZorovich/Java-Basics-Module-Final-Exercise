package org.globantUniversity.data;

import java.util.ArrayList;

public class Teacher {

    protected int id;
    protected int identityCard;
    protected String name;
    protected ArrayList<Subject> teacherSubjectsList;

    protected static double baseSalary = 2000;
    protected double totalSalary;
    private static int counter = 0;

    public Teacher(int identityCard, String name) {
        this.id = counter;
        this.identityCard = identityCard;
        this.name = name;
        this.teacherSubjectsList= new ArrayList<>();
        counter ++;
    }

    public int getId() {
        return id;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public String getName() {
        return name;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherSubjectsList(Subject subject) {
        this.teacherSubjectsList.add(subject);
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return String.format("|%20d|%20d|%20s|",id,identityCard,name);
    }
}
