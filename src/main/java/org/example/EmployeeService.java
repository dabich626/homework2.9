package org.example;

public class EmployeeService extends Employee{
    public EmployeeService(String name, String secondName, String surname, int salary, int department) {
        super(name, secondName, surname, salary, department);
    }

    public void checkValidate (String name, String secondName, String surmane){

        if (!checkVal(name, secondName, surmane)){

            throw new Exception400BadRequest;
        }
    }

    private boolean checkVal(String name, String secondName, String surmane){

        return StringUtils.isEmpty(name) && StringUtils.isEmpty(secondName) && StringUtils.isEmpty(surname);
    }
}
