
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Employees {
    private ArrayList<Person> employeeList = new ArrayList<Person>(); 
    
    public void add(Person personToAdd) {
        employeeList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person personList: peopleToAdd) {
            employeeList.add(personList);
        }
    }

    public void print() {
        for (Person printEmployee: employeeList) {
            System.out.println(printEmployee);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            
            if (nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }

    }
