package com.aurion.model;

public class studentLinkedHashsetModel {
    private String name;
    private int rollnumber;
    private double percentage;

    @Override
    public String toString() {
        return "studentLinkedHashsetModel [name=" + name + ", rollnumber=" + rollnumber + ", percentage=" + percentage + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public studentLinkedHashsetModel(String name, int rollnumber, double percentage) {
        super();
        this.name = name;
        this.rollnumber = rollnumber;
        this.percentage = percentage;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollnumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        studentLinkedHashsetModel student = (studentLinkedHashsetModel) obj;
        return rollnumber == student.rollnumber;
    }
}
