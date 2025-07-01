package com.project.javaOOP;

public class Main {
    public static void main(String[] args) {
        // Create Object from Class Person
        Person Benz = new Person();


        // Set Attribute in Object Benz
//        Benz.Name = "Aittiphon";
//        Benz.Age = 20;
//        Benz.Gender = "Male";
//        Benz.Occupation = "Teacher";

        Benz.setName("Aittiphon");
        Benz.setAge(24);
        Benz.setGender("Male");
        Benz.setOccupation("Teacher");

        System.out.println("Information Person");
        System.out.println("Name : " + Benz.getName());
        System.out.println("Name : " + Benz.getGender());
        System.out.println("Name : " + Benz.getAge());
        System.out.println("Name : " + Benz.getOccupation());

        // Set Methods in Object Benz
        Benz.walk();
        Benz.Eat();
        Benz.Sleep();
        Benz.Work();

    }
}
