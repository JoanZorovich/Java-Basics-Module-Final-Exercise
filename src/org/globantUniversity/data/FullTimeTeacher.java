package org.globantUniversity.data;

/**
 * this class inherits from teacher and was created in order
 * to identify full-time teachers, the salary they earn, and the amount of time they work
 */
public class FullTimeTeacher extends Teacher{

    private int experienceYears;

    public FullTimeTeacher(int identityCard, String name,int experienceYears) {
        super(identityCard, name);
        this.experienceYears=experienceYears;
        super.totalSalary=salaryCalculated();
    }

    /**
     * Through this method, the total salary earned by the teacher is calculated according to a
     * common base salary for all teachers and their years of experience.
     * @return total salary number
     */
    private double salaryCalculated(){
        return super.baseSalary*(1.1*this.experienceYears);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s|", this.totalSalary);
    }
}
