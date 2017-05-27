package pl.org.progress.financeweek;

import java.util.Date;

/**
 * Created by barto on 4/18/2017.
 */

public class TodoTask {
    private long id;
    private String description;
    private boolean completed;

    public TodoTask(String description) {
        this.description = description;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

