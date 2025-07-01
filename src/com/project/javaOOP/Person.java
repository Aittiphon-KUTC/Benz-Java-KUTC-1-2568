package com.project.javaOOP;

public class Person {
    //Define Attribute

    private String Name ;
    private int Age;
    private String Gender;
    private String Occupation ;

    // Getting in private
    public String getOccupation() {
        return Occupation;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    // Setting in private
    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    //Define Method
    void walk(){
        System.out.println(Name + " Age : " + Age + " Gender: " + Gender + "  is Walking");
    }

    void Eat(){
        System.out.println(Name + " Age : " + Age + " Gender: " + Gender + "  is Eat");
    }

    void Sleep(){
        System.out.println(Name + " Age : " + Age + " Gender: " + Gender + "  is Sleep");
    }

    void Work(){
        System.out.println(Name + " Age : " + Age + " Gender: " + Gender + "  is Work");
    }

}

