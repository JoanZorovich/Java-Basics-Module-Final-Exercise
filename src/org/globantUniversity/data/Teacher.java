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



    public String getName() {
        return name;
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
