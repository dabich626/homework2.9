package org.example;


public class Employee {


    private  int id = 0;

    private static int idCount;
    private String name;
    private String secondName;

    private String surname;

    private int salary;

    private int department;

    public Employee(String name, String secondName, String surname, int salary, int department) {

        this.name = StringUtils.capitalize(name.toLowerCase());
        this.secondName = StringUtils.capitalize(secondName.toLowerCase());
        this.surname = StringUtils.capitalize(surname.toLowerCase());
        this.salary = salary;
        this.department = department;
        this.id = idCount++;



    }


    public String getName() {

        return this.name;
    }

    public String getSecondName() {

        return this.secondName;
    }

    public String getSurname() {

        return this.surname;
    }

    public int getSalary() {

        return this.salary;
    }

    public int setSalary(){

        return this.salary;
    }

    public int getDepartment() {

        return this.department;
    }

    public int setDepartment(){

        return this.department;
    }

    public int getId () {

        return id;
    }

    public String toString() {

        return "id: " + id + " имя: " + this.name + " отчество: " + this.secondName + " фамилия: " + this.surname + " зарплата: " + this.salary + " отдел: " + this.department;
    }

}

