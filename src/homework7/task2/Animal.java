package homework7.task2;

import java.io.Serializable;

public class Animal implements Serializable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}