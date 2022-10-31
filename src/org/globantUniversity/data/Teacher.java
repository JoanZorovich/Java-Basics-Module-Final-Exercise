package org.globantUniversity.data;

import java.util.ArrayList;

public class Teacher {

    protected int identityCard;
    protected String name;
    protected ArrayList<Subject> teacherSubjectsList;

    protected static double baseSalary = 2000;
    protected double totalSalary;



    public Teacher(){};
    public Teacher(int identityCard, String name) {
        this.identityCard = identityCard;
        this.name = name;
        this.teacherSubjectsList= new ArrayList<>();
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

    public boolean isARegisteredTeacher(int identityCard){
        boolean isRegisteredTeacher = false;
        if(this.identityCard == identityCard){
            isRegisteredTeacher = true;
        }
        return isRegisteredTeacher;
    }

    @Override
    public String toString() {
        return String.format("|%20s|%20s|",identityCard,name);
    }
}
