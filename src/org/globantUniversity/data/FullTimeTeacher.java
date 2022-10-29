package org.globantUniversity.data;

public class FullTimeTeacher extends Teacher{

    private int experienceYears;

    public FullTimeTeacher(int identityCard, String name,int experienceYears) {
        super(identityCard, name);
        this.experienceYears=experienceYears;
        super.totalSalary=salaryCalculated();
    }

    private double salaryCalculated(){
        return super.baseSalary*(1.1*this.experienceYears);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s|", this.totalSalary);
    }
}
