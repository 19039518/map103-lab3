package map103lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18039786
 */


import map103lab3.Person;
 import java.util.Date;
public class Employee extends Person {
    private int employeeNumber;
    
    public Employee(int number, String first, String last, Date BirthDate, int Age)
    {
        super(first, last, BirthDate, Age);
        this.employeeNumber = number;
    }
    public void setEmployeeNumber(int number)
    {
        if (number < 0)
        {
            return;
        }
        this.employeeNumber = number;
    }
    public int getEmployeeNumber()
    {
        return this.employeeNumber;
    }
}
    
    
    

