package Task_10.Problem3;

public class ThreadPoolTasks {
    public void completeTasks(int idOfTask) {
        System.out.println("Task " + idOfTask + " is started.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + idOfTask + " is completed.");
    }
}
