package org.globantUniversity.data;

public class PartTimeTeacher extends Teacher{

    private int activeHoursPerWeek;

    public PartTimeTeacher(int identityCard, String name, int activeHoursPerWeek) {
        super(identityCard, name);
        this.activeHoursPerWeek = activeHoursPerWeek;
        super.totalSalary= salaryCalculated();
    }

    private double salaryCalculated(){
        return super.baseSalary*this.activeHoursPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s|",this.totalSalary);
    }
}
