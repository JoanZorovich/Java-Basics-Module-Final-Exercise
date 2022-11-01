package org.globantUniversity.data;

/**
 * this class inherits from teacher and was created in order
 * to identify part-time teachers, the salary they earn, and the amount of time they work
 */
public class PartTimeTeacher extends Teacher{

    private int activeHoursPerWeek;

    public PartTimeTeacher(int identityCard, String name, int activeHoursPerWeek) {
        super(identityCard, name);
        this.activeHoursPerWeek = activeHoursPerWeek;
        super.totalSalary= salaryCalculated();
    }

    /**
     * Through this method, the total salary earned by the teacher is calculated according to a
     * common base salary for all teachers and their activeHoursPerWeek.
     * @return total salary number
     */
    private double salaryCalculated(){
        return super.baseSalary*this.activeHoursPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s|",this.totalSalary);
    }
}
