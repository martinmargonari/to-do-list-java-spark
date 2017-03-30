/**
 * Created by Margonari on 28/03/2017.
 */
public class Task {

    private String mDescription;
    private boolean done;
    private int idTask;

    private static int id=1;


    public Task(String description) {
        mDescription = description;
        done = false;
        idTask = id;
        Task.id++;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public boolean done() {
        return this.done;
    }

    public void doTask() {
        this.done = true;
    }

    public int getIdTask() {
        return this.idTask;
    }
}
