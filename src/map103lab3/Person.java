package map103lab3;


import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18039786
 */
import java.util.Date;

public class Person {
    private String FirstName;
    private String LastName;
    private int Age;
    private Date BirthDate;
    
    Person(String first, String last, Date BirthDate, int Age)
    {
        this.FirstName = first;
        this.LastName = last;
        this.BirthDate = BirthDate;
        this.Age = Age;
        
    }
    public void setFirstName(String first)
    {
        this.FirstName = first;
    }
    public void setLastName(String last)
    {
        this.LastName = last;
    }
    public void setBirthDate(Date BirthDate)
    {
        this.BirthDate = BirthDate;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }
    
    public String getFirstName()
    {
        return this.FirstName;
    }
    public String getLastName()
    {
        return this.LastName;
    }
     public Date getBirthDate()
    {
        return this.BirthDate;
    }
    public int getAge()
    {
        return this.Age;
    }
   
    
    }
    

