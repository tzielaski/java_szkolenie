package pl.com.sages.webapp.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    public Employee(){

    }

    Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String lastName;

    long getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " " + lastName;
    }

}
