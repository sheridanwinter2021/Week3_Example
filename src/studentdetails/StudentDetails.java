/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

/** checking in nbeans
 * MVC  - organizing code
 * view class
 * @author sivagamasrinivasan date: June 1st
 this is branch */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Student[] list = new Student[2]; //array of object 
       
       Student s1 = new Student();
        s1.setName("peter"); //incorrect mark - avoid direct and incorrect marks - encapsulation principle
       s1.setAge(23);       
               
       Student s2 = new Student();      
       s2.setName("john"); //incorrect mark - avoid direct and incorrect marks - encapsulation principle
       s2.setAge(23);
       
       list[0]= s1;
       list[1]= s2; //stored object in array
      
       System.out.println(list[0].getName() + list[0].getAge() + " "+ list[1].getName() + list[1].getAge());


    }
    
}
