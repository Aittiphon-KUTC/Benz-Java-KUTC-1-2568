package com.project.javaOOP;

public class Student extends Person {
    private String ID_Student ;
    private String Department ;
    private String Year;

    //Attribute
    public Student(String name, int age, String gender, String occupation, String ID_Student, String department, String year) {
        super(name, age, gender, occupation);
        this.ID_Student = ID_Student;
        Department = department;
        Year = year;
    }

    //Getter Subclass
    public String getID_Student() {
        return ID_Student;
    }
    public String getDepartment() {
        return Department;
    }
    public String getYear() {
        return Year;
    }


    //method subclass
//    void learn (){
//        super.Work();
//        System.out.println(getName() + " Age : " + getAge() + " Gender: " + getGender() + "  But not work, Now is learning");
//    }
    @Override
    void Work (){
        System.out.println(getName() + " Age : " + getAge() + " Gender: " + getGender() + "  But not work, Now is learning");
    }




    @Override
    void displayinformation(){
        System.out.println("Information Person");
        System.out.println("Name : " + getName());
        System.out.println("Name : " + getGender());
        System.out.println("Name : " + getAge());
        System.out.println("Name : " + getOccupation());
    }
}

