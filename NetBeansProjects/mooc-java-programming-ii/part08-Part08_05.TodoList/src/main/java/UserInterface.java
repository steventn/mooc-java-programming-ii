import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner; 
    
    public UserInterface (TodoList list, Scanner scanner) {
        this.todoList = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            if (input.equalsIgnoreCase("add")) {
                System.out.println("To add: ");
                input = scanner.nextLine();
                todoList.add(input);
            }
            if (input.equalsIgnoreCase("list")) {
                todoList.print();
            }
            if (input.equalsIgnoreCase("remove")) {
                int taskNumber = Integer.valueOf(scanner.nextLine());
                todoList.remove(taskNumber);
            }
        }
    }
}
