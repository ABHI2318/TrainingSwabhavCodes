package com.aurion.model;

public class studentHashsetModel {
    private String name;
    private int rollnumber;
    private double percentage;

    @Override
    public String toString() {
        return "studentHashsetModel [name=" + name + ", rollnumber=" + rollnumber + ", percentage=" + percentage + "]";
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

    public studentHashsetModel(String name, int rollnumber, double percentage) {
        super();
        this.name = name;
        this.rollnumber = rollnumber;
        this.percentage = percentage;
    }
    public void displaydetails() {
		   System.out.println("the name of student is "+name);
		   System.out.println("the roll no is "+rollnumber);
		   System.out.println("the percentage of student is "+percentage);
}

//    @Override
//    public int hashCode() {
//        return Integer.hashCode(rollnumber);
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        if (this == object) {
//            return true;
//        }
//        if (object == null || getClass() != object.getClass()) {
//            return false;
//        }
//        studentHashsetModel student = (studentHashsetModel) object;
//        return rollnumber == student.rollnumber;
    
}
