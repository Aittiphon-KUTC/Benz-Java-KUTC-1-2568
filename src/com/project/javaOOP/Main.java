package com.project.javaOOP;

public class Main {
    public static void main(String[] args) {
        // Create Object from Class Person
//        Person Benz = new Person();


        //Create Object 2 Object Polymorphism
//        Person Hong = new Person("Phacharapon",23, "Female","Freelance");
        Person Benz = new Student("Aittiphon", 24, "Male", "Student", "63011", "Conputer", "2");

        //Show Attribute in subclass and superclass
//        System.out.println("ID Student : " + Benz.getID_Student());
//        System.out.println("Name : " + Benz.getName());
//        System.out.println("Age : " + Benz.getAge());
//        System.out.println("Gender : " + Benz.getGender());
//        System.out.println("Department : " + Benz.getDepartment());
//        System.out.println("Year : " + Benz.getYear());

        //Call Method

        Benz.Work();



        // Set Attribute in Object Benz
//        Benz.Name = "Aittiphon";
//        Benz.Age = 20;
//        Benz.Gender = "Male";
//        Benz.Occupation = "Teacher";

//        Benz.setName("Aittiphon");
//        Benz.setAge(24);
//        Benz.setGender("Male");
//        Benz.setOccupation("Teacher");
//
//        System.out.println("Information Person");
//        System.out.println("Name : " + Benz.getName());
//        System.out.println("Name : " + Benz.getGender());
//        System.out.println("Name : " + Benz.getAge());
//        System.out.println("Name : " + Benz.getOccupation());
//
//        // Set Methods in Object Benz
//        Benz.walk();
//        Benz.Eat();
//        Benz.Sleep();
//        Benz.Work();

    }
}
