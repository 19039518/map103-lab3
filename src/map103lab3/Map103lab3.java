/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MAP103Lab3 {
 public static void mAIN(String[]args){
 Employee[] employees = new Employee[3];
 employees[0] = new Employee(1, "ROBERT", "DOWNEY", new Date(), 54);
 employees[1] = new Employee(32, "JENIT", "DARULA", new Date(), 33);
 employees[2] = new Employee(24, "WILL", "SMTH", new Date(), 36);
 Scanner input = new Scanner(System.in);
 int numberFromUser = -1;
 while ( numberFromUser != 0) {
 System.out.println("Enter the number of employee (between 1 and 3):");
 numberFromUser = input.nextInt();
 if(numberFromUser==1) {
 System.out.println(employees[0].getEmployeeNumber());
 System.out.println(employees[0].getFirstName());
 System.out.println(employees[0].getLastName());
 System.out.println(employees[0].getBirthDate());
 System.out.println(employees[0].getAge());
 System.out.println("-----------------------");
 } else if (numberFromUser==2) {
 System.out.println("Employee no:");
 System.out.println(employees[1].getEmployeeNumber());
 System.out.println(employees[1].getFirstName());
 System.out.println(employees[1].getLastName());
 System.out.println(employees[1].getBirthDate());
 System.out.println(employees[1].getAge());
 System.out.println("-----------------------");
 } else if(numberFromUser==3) {
 System.out.println("Employee no:");
 System.out.println(employees[2].getEmployeeNumber());
 System.out.println(employees[2].getFirstName());
MAP103 – Android Development using Android Studio Lab 3
Page 2 of 2
 System.out.println(employees[2].getLastName());
 System.out.println(employees[2].getBirthDate());
 System.out.println(employees[2].getAge());
 System.out.println("-----------------------");
 } else if (numberFromUser ==0 ) {
 System.out.println("Thank you for using this Java program.....");
 input.close();
 System.exit(0);
 }
 }
 }
}

/**
 *
 * @author 19039518
 */
public class Map103lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
