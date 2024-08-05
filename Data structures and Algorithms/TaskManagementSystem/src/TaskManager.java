import java.util.LinkedList;

public class TaskManager {
    LinkedList<Task>l;
    public TaskManager(){
        l=new LinkedList<>();
    }
    public void add(Task task, int index){
        if(index==-1)
            l.add(task);
        else
            l.add(index, task);
    }
    public int search(String taskId){
        for(int i=0;i<l.size();i++){
            Task temp=l.get(i);
            if(temp.getTaskId().equals(taskId)){
                System.out.println("Task found. It is at index "+i);
                return i;
            }
        }
        System.out.println("Task is not found !");
        return -1;
    }
    public void traverse(){
        System.out.println("Traversing the linked list : ");
        for(int i=0;i<l.size();i++)
            System.out.println(l.get(i));
    }
    public void delete(String id){
        System.out.println("Searching the element to delete .");
        int i=search(id);
        if(i!=-1){
            System.out.println("Deleting ....");
            l.remove(i);
        }
    }

    public static void main(String[] args) throws Exception {
        TaskManager taskManager=new TaskManager();
        
        Task t1=new Task("T001", "Cleaning", "Doing");
        Task t2=new Task("T002", "Eating", "Done");
        Task t3=new Task("T003", "Drinking", "Pending");
        Task t4=new Task("T004", "Sleeping", "Pending");
        Task t5=new Task("T005", "Studying", "Done");
        Task t6=new Task("T006", "Flying", "Pending");

        taskManager.add(t6, -1);
        taskManager.add(t1, -1);
        taskManager.add(t2, -1);
        taskManager.add(t5, -1);
        taskManager.add(t4, -1);
        taskManager.add(t3, -1);

        taskManager.search("T005");
        taskManager.delete("T001");
        taskManager.traverse();
    }
}
