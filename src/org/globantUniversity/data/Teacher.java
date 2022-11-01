package org.globantUniversity.data;

import java.util.ArrayList;

/**
 * create and consult information of a teacher
 */

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

    /**
     *Validate if a teacher has already been created
     * @param identityCard input data from console
     * @return true if the teacher is registered, false if not
     */
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
