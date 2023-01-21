package CourseWork1;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int unit;
    private double wage;
    public static int counter=0;
    private int id;

    public Employee (String fullName, int unit, double wage) {
        this.fullName = fullName;
        this.unit = unit;
        this.wage = wage;
        id=counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getUnit() {
        return unit;
    }

    public double getWage() {
        return wage;
    }

    public int getId() {
        return id;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double setWage(double wage) {
        this.wage = wage;
        return wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return unit == employee.unit && wage == employee.wage && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, unit, wage);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", unit=" + unit +
                ", wage=" + wage +
                ", id=" + id +
                '}';
    }

}

