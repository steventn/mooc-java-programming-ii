
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList;

    public TodoList() {
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task) {
        taskList.add(task);
    }
    
    public void print() {
        for (String task: taskList) {
            System.out.println((taskList.indexOf(task) + 1) + ": " + task);
        }
    }
    
    public void remove(int number) {
        taskList.remove(number - 1);
    }
}
